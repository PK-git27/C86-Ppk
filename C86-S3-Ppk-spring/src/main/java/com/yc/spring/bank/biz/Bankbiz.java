package com.yc.spring.bank.biz;

import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yc.spring.bank.dao.AccountDao;
import com.yc.spring.bank.dao.OprecordDao;

@Service
@Transactional(rollbackFor = {IOException.class,SQLException.class})
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
	
	@Transactional(rollbackFor = {BizException.class})
	public void save(int id,double money) throws BizException {
		//省略参数校验
		adao.update(id, money);
		if(money > 999) {
			throw new BizException("金额不能大于999");
		}
		odao.insert(id, money);
	}
	
	public void transfer(int id1,int id2,double money) throws BizException {
		save(id1, -money);
		save(id2, money);
	}
	
	
}
