package com.yc.C86S3Ppkblog.web;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yc.C86S3Ppkblog.bean.Result;
import com.yc.C86S3Ppkblog.bean.User;
import com.yc.C86S3Ppkblog.biz.BizException;
import com.yc.C86S3Ppkblog.biz.UserBiz;
import com.yc.C86S3Ppkblog.util.Utils;

@Controller
public class UserAction {
	
	@Resource
	private UserBiz ubiz;
	/**
	 * 注册：表单提交==>页面跳转
	 * @throws BizException 
	 */
	@PostMapping("reg.do")
	public String register(@Valid User user,Errors errors, Model m) {
		if(errors.hasErrors()) {
			m.addAttribute("errors", Utils.asMap(errors));
			m.addAttribute("user", user);
			return "reg";             
		}
		try {
			ubiz.register(user);
		} catch (BizException e) {
			e.printStackTrace();
			errors.rejectValue("account", "account", e.getMessage());
			m.addAttribute("errors", Utils.asMap(errors));
			m.addAttribute("user", user);
			return "reg";
		}
		//使用响应重定向方式跳转
		return "redirect:/";
	}
	@GetMapping("toreg")
	public String toreg() {
		return "reg";
	}
	/**
	 * 登录：Ajax提交
	 */
	@PostMapping("login.do")
	// 是在 Controller 使用 ==> 方法返回视图名 
	// @ResponseBody 表示该方法的返回值是json数据
	@ResponseBody
	public Result login(@Valid User user,Errors errors,HttpSession session) {
		try {
			if(errors.hasFieldErrors("account") || errors.hasFieldErrors("pwd")) {
				//将错误结果转换成Map集合再返回
				Result res = new Result(0, "验证错误！", Utils.asMap(errors));
				return res;
			}
			User dbuser = ubiz.login(user);
			session.setAttribute("loginedUser", dbuser);
			return new Result(1, "登录成功",dbuser);
		} catch (BizException e) {
			e.printStackTrace();
			return new Result(e.getMessage());
		}
	}
	
	

}
