package com.yc.C86S3Ppkblog.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.yc.C86S3Ppkblog.bean.Category;
@Repository
public interface CategoryMapper {
	
	
	
	@Select("select * from category where id=#{id}")
	public Category selectById(int id);
	

}
