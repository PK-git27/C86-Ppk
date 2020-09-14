package com.yc.crbook.web;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.crbook.bean.CrBook;
import com.yc.crbook.bean.CrShow;
import com.yc.crbook.web.remote.IBookAction;

@Controller
public class IndexAction {
	
	@Resource
	private IBookAction baction;
	
	@GetMapping("/")
	public String index(Model m) {
		
		//从book网元获取最新的图书12本
		//使用FeIgn 远程调用book的服务
		//1定义一个接口，用于远程访问服务
		//2调用远程服务
		List<CrBook> newBooks = baction.getNewBooks();
		
		//推送给页面
		m.addAttribute("newBooks",newBooks);
		
		// 第一个编辑推荐
		List<CrShow> recom1 = baction.getRecom1();
		m.addAttribute("recom1", recom1);
		System.out.println(recom1+"-----------------------------------------------");
		return "index";
	}
	
	@GetMapping(path= {"login","login.html"})
	public String tologin() {
		return "login";
	}
	
	

}
