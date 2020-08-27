package com.yc.C86S3Ppkblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.yc.C86S3Ppkblog.bean.Article;
@Repository
public interface ArticleMapper {
	
	@Select("select * from article order by createtime desc")
	@Results(id = "rmVm",value = {
		@Result(id=true,column = "id",property = "id"),
		@Result(column = "categoryid",property = "categoryid"),
		@Result(
				column = "categoryid",
				property = "category",
				one = @One(select = "com.yc.C86S3Ppkblog.dao.CategoryMapper.selectById")
				)
		})
	public List<Article> selectByNew();
	
	@Select("select * from article order by readcnt desc limit 5")
	@ResultMap("rmVm")
	public List<Article> selectByreadCnt();
	
	@Select("select * from article where id=#{id}")
	@ResultMap("rmVm")
	public Article selectById(int id);
	
	@Insert("insert into article values (#{id},#{author},#{title},#{content},"
			+ "#{keywords},#{description},#{categoryid},#{label},#{titleimgs},"
			+ "#{status},now(),#{readcnt},#{agreecnt})")
	@Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
	@ResultMap("rmVm")
	public int insert(Article a);


}
