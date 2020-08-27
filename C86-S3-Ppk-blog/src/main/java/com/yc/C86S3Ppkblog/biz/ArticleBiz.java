package com.yc.C86S3Ppkblog.biz;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yc.C86S3Ppkblog.bean.Article;
import com.yc.C86S3Ppkblog.dao.ArticleMapper;

@Service
public class ArticleBiz {

	@Resource
	private ArticleMapper aMapper;
	
	public int create(Article art) {
		return aMapper.insert(art);
	}
	
}
