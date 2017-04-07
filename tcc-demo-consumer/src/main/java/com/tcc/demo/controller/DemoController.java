package com.tcc.demo.controller;

import javax.servlet.http.HttpServletResponse;

import org.mengyun.tcctransaction.CancellingException;
import org.mengyun.tcctransaction.ConfirmingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tcc.demo.api.service.DemoService;
import com.tcc.demo.api.vo.DemoVo;

@Controller
public class DemoController {
	
	@Reference
	private DemoService demoService;
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public void index(HttpServletResponse response) {
		DemoVo demoVo=new DemoVo();
		demoVo.setUserName("hi-tcc");
		demoVo.setUserPassword("abc");
		Boolean result=false;
		try {
			demoService.record(null, demoVo);
		} catch (ConfirmingException confirmingException) {
            //exception throws with the tcc transaction status is CONFIRMING,
            //when tcc transaction is under confirming status,
            // the tcc transaction recovery will try to confirm the whole transaction to ensure eventually consistent.
            result = true;
        } catch (CancellingException cancellingException) {
            //exception throws with the tcc transaction status is CANCELLING,
            //when tcc transaction is under CANCELLING status,
            // the tcc transaction recovery will try to cancel the whole transaction to ensure eventually consistent.
        } catch (Throwable e) {
            //other exceptions throws at TRYING stage.
            //you can retry or cancel the operation.
        	e.printStackTrace();
        }
		System.out.println(result);
	}
}
