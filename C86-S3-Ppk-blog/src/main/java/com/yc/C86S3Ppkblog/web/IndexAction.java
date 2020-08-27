package com.yc.C86S3Ppkblog.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.yc.C86S3Ppkblog.dao.ArticleMapper;

@Controller
public class IndexAction {
	
	@Resource
	private ArticleMapper Amapper;

	@GetMapping("/")
	public String index(Model m, @RequestParam(defaultValue = "1")int page) {
		//在执行查询前，设置分页参数
		PageHelper.startPage(page, 5);
		m.addAttribute("alist", Amapper.selectByNew());
		m.addAttribute("hlist", Amapper.selectByreadCnt());
		return "index";
	}
	
	
}
