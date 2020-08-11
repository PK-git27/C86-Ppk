package com.yc.cinema.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yc.cinema.dao.ActorDao;

@Service
public class ActorBiz {
	@Autowired
	private ActorDao adao;

	public ActorDao getAdao() {
		return adao;
	}

	public void setAdao(ActorDao adao) {
		this.adao = adao;
	}
	
}
