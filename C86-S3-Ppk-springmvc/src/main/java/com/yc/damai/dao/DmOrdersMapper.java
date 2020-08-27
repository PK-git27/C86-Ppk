package com.yc.damai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import com.yc.damai.bean.DmOrders;

public interface DmOrdersMapper {

	List<DmOrders> selectAll();
	
	@Insert("insert into dm_orders values (null , #{total}, now(), #{state}, #{uid}, #{aid})")
    @Options(useGeneratedKeys=true , keyProperty="id", keyColumn="id")	
	int insert(DmOrders dos);
	
}
