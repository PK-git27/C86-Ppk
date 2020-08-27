package com.yc.C86S3PpkSpringBoot.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.yc.C86S3PpkSpringBoot.dao.ProductMapper;
import com.yc.damai.bean.DmProduct;

@Controller
//默认情况下，所有的方法的返回值被解析成视图
//templates目录下的文件
public class IndexAction {

	@Resource
	ProductMapper pm;
	
	@GetMapping("index.do")
	public String index(Model m) {
		
		//查询热销商品
		List<DmProduct> hlist = pm.selectByHot();
		List<DmProduct> list1 = pm.selectByHot();
		Map<String, Object> map = new HashMap<String, Object>(); 
		map.put("hlist", hlist);
		map.put("list1", list1);
		//推送给页面
		m.addAllAttributes(map);
		return "index";
	}
	
	@GetMapping("detail.do")
	public String detail(Model m,int id) {
		
		//查询热销商品
		DmProduct dp = pm.selectById(id);
		//推送给页面
		m.addAttribute("dp",dp);
		return "detail";
	}
	
}
