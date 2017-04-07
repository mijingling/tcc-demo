package com.tcc.demo.api.service;

import org.mengyun.tcctransaction.api.TransactionContext;

import com.tcc.demo.api.vo.DemoVo;

public interface DemoService {
	
	void record(TransactionContext transactionContext,DemoVo demoVo);
	
}
