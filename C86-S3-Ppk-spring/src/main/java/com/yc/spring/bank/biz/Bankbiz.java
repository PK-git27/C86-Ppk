package com.yc.spring.bank.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.spring.bank.dao.AccountDao;
import com.yc.spring.bank.dao.OprecordDao;

@Service
public class Bankbiz {

	@Resource
	private AccountDao adao;
	@Resource
	private OprecordDao odao;
	
	/**
	 * 开户
	 */
	public void register(int id,String pwd,double money) {
		//省略参数校验
		adao.insert(id, pwd, money);
		odao.insert(id, money);
	}
	
	public void save(int id,double money) {
		//省略参数校验
		adao.update(id, money);
		int i = 1/0;
		odao.insert(id, money);
	}
	
	public void transfer(int id1,int id2,double money) {
		adao.update(id1, -money);
		adao.update(id2, money);
	}
	
	
}
