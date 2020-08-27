package com.yc.C86S3Ppkblog.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.C86S3Ppkblog.bean.Comment;
import com.yc.C86S3Ppkblog.dao.CommentMapper;

@Service
public class CommentBiz {
	
	@Resource
	private CommentMapper cMapper;
	
	public Comment create(Comment com) {
		cMapper.insert(com);
		return com;
	}

}
