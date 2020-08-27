package com.yc.damai.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.yc.damai.util.DBHelper;

@WebServlet("/product.do")
public class ProductServlet extends BaseAction {
	private static final long serialVersionUID = 1L;
       
	protected void query(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sql = "select * from dm_product where is_hot=1 limit 0,10";
		List<?> list = new DBHelper().query(sql);
		HashMap<String,Object> page = new HashMap<>();
		page.put("list", list);
		print( response, page);
	}
	
	// 查询某件商品
	protected void queryById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String sql = "select * from dm_product where id = ?";
		List<?> list = new DBHelper().query(sql, id);
		print( response, list.get(0));
	}	
	
	protected void queryCategory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("id");
		String sql = "select * from dm_product where id = ?";
		List<?> list = new DBHelper().query(sql, id);
		print( response, list.get(0));
	}	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
