package com.yc.favorite.dao;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.yc.favorite.FavoriteBiz;
import com.yc.favorite.bean.Favorite;
import com.yc.favorite.util.MyBatisHelper;

public class BaseTest {
	@Test
	public void test1(){
		SqlSession session=MyBatisHelper.openSession();
		FavoriteMapper fm=session.getMapper(FavoriteMapper.class);
		TagMapper tm=session.getMapper(TagMapper.class);
		TagFavoriteMapper tf=session.getMapper(TagFavoriteMapper.class);
		
		Favorite f=new Favorite();
		f.setFlabel("百度");
		f.setFurl("baidu.com");
		f.setFdesc("搜索网站");
		f.setFtags("解答");
		
		fm.insert(f);
		session.commit();
		session.close();
	}
	@Test
	public void test2(){
		FavoriteBiz fb=new FavoriteBiz();
		Favorite f=new Favorite();
		f.setFlabel("淘宝");
		f.setFurl("taobao.com");
		f.setFdesc("败家网站");
		f.setFtags("购物,生活");
		fb.addFavorite(f);
	}
	@Test
	public void test3(){
		FavoriteBiz fb=new FavoriteBiz();
		Favorite f=new Favorite();
		f.setFlabel("网易");
		f.setFurl("163.com");
		f.setFdesc("常用网站");
		f.setFtags("门户,生活");
		fb.addFavorite(f);
	}
	
	@Test
	public void test4(){
		SqlSession session = MyBatisHelper.openSession();
		FavoriteMapper mapper = session.getMapper(FavoriteMapper.class);
		mapper.selectByTid(4);
		mapper.selectByTid(null);
		mapper.selectByTid(0);
		
		
	}
	

}
