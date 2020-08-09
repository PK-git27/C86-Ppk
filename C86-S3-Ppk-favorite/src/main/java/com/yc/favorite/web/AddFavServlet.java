package com.yc.favorite.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.yc.favorite.FavoriteBiz;
import com.yc.favorite.bean.Favorite;
import com.yc.favorite.dao.FavoriteMapper;
import com.yc.favorite.util.MyBatisHelper;

@WebServlet("/add.do")
public class AddFavServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		SqlSession session = MyBatisHelper.openSession();
		Favorite dp = new Favorite();
		FavoriteBiz fb = new FavoriteBiz();
		String flabel = request.getParameter("flabel");
		String furl = request.getParameter("furl");
		String fdesc = request.getParameter("fdesc");
		String ftags = request.getParameter("ftags");
		if(flabel.trim().isEmpty()||flabel==null) {
			response.getWriter().append("请输入名称");
		}
		dp.setFlabel(flabel);
		dp.setFurl(furl);
		dp.setFdesc(fdesc);
		dp.setFtags(ftags);
		fb.addFavorite(dp);
		session.commit();
		response.getWriter().append("添加成功");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
