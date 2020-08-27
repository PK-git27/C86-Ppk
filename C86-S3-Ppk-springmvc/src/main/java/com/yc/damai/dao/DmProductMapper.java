package com.yc.damai.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.yc.damai.bean.DmProduct;

public interface DmProductMapper {

	/**
	 * @Select 注解默认使用resultType映射行为
	 * @return
	 */
	@Select("select * from dm_product")
	//Results替代<resultMap> @Result替代<result>
	@Results(id="rmdp", value={
		@Result(column="id",property="id", id =true),
		@Result(column="market_price",property="marketPrice"),
		@Result(column="shop_price",property="shopPrice"),
		@Result(column="is_hot",property="isHot"),
	
	})
	List<DmProduct> selectAll();
	
	@Select("select * from dm_product where id = #{id}")
	//ResultMap替换resultMap属性
	@ResultMap("rmdp")
	DmProduct selectById(int id);
	@Select("select * from dm_product where is_hot=1")
	List<DmProduct> selectForHot();
	
	List<DmProduct> selectByObj(DmProduct dp);
	
	
	
	/**
	 * 根据枚举的分类id进行查询
	 */
	List<DmProduct> selectByCids(@Param("cids") int[] cids);
	
	int update(DmProduct dp);
	
}
