package com.tcc.demo.service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.mengyun.tcctransaction.Compensable;
import org.mengyun.tcctransaction.api.TransactionContext;

import com.alibaba.dubbo.config.annotation.Service;
import com.tcc.demo.api.service.DemoService;
import com.tcc.demo.api.vo.DemoVo;

@Service(protocol = { "dubbo" })
public class DemoServiceImpl implements DemoService{

	private ExecutorService executorService = Executors.newFixedThreadPool(100);
	/**
	 * Try: 尝试执行业务
	 * 完成所有业务检查（一致性）；预留必须业务资源（准隔离性）
	 */
    @Compensable(confirmMethod = "confirmRecord", cancelMethod = "cancelRecord")
    public void record(TransactionContext transactionContext, DemoVo demoVo){

    	//执行dubbo-a服务
    	//执行dubbo-b服务
    	//执行dubbo-c服务
    	
//    	if (true) {
//            throw new RuntimeException("try failed.");
//        }
    	System.out.println("try'.'");
    }
    /**
     * Confirm: 确认执行业务
     * 真正执行业务；不作任何业务检查；只使用Try阶段预留的业务资源；Confirm操作满足幂等性
     */
    public void confirmRecord(TransactionContext transactionContext, DemoVo demoVo) {
    	System.out.println("confirm^.^");
    }
    /**
     * Cancel: 取消执行业务
     * 释放Try阶段预留的业务资源；Cancel操作满足幂等性
     */
    public void cancelRecord(TransactionContext transactionContext, DemoVo demoVo) {
//    	if (true) {
//		    throw new RuntimeException("cancel failed.");
//		}
    	System.out.println("cancel@.@");
    }
	
}
