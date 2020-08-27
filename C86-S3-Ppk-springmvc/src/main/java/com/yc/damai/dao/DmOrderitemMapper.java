package com.yc.damai.dao;

import java.util.List;

import com.yc.damai.bean.DmOrderitem;

public interface DmOrderitemMapper {

	List<DmOrderitem> selectAll();
	
	DmOrderitem selectById(int id);
	
	List<DmOrderitem> selectByOid(int id);
	
	int insert(DmOrderitem dos);
}
