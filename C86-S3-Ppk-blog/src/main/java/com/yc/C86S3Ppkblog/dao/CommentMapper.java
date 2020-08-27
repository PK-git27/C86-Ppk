package com.yc.C86S3Ppkblog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.yc.C86S3Ppkblog.bean.Comment;
@Repository
public interface CommentMapper {
	
	
	@Insert("insert into comment values(null,#{articleid},#{content},#{createby},now())")
	public int insert(Comment com); 
	
	@Select("select * from comment where articleid=#{articleid}")
	public List<Comment> selectByArticle(int articleid);

}
