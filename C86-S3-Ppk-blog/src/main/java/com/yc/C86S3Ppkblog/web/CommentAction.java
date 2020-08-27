package com.yc.C86S3Ppkblog.web;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.yc.C86S3Ppkblog.bean.Comment;
import com.yc.C86S3Ppkblog.bean.Result;
import com.yc.C86S3Ppkblog.bean.User;
import com.yc.C86S3Ppkblog.biz.CommentBiz;
import com.yc.C86S3Ppkblog.dao.CommentMapper;

@RestController
public class CommentAction {

	@Resource
	private CommentMapper cMapper;
	@Resource
	private CommentBiz cbiz;
	@PostMapping("comment")
	public Result comment(Comment comm,@SessionAttribute User loginedUser) {
		comm.setCreateby(loginedUser.getId());
		cbiz.create(comm);
		return new Result(1,"回復成功",comm);
	}
	
	@GetMapping("queryComm")
	public Result comment(int articleid) {
		return new Result(1,"查詢回復成功",cMapper.selectByArticle(articleid));
	}
	
}
