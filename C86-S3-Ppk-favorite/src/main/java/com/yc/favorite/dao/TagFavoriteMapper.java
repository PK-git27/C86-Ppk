package com.yc.favorite.dao;

import org.apache.ibatis.annotations.Insert;

import com.yc.favorite.bean.Tagfavorite;

public interface TagFavoriteMapper {
	@Insert("insert into tagfavorite values(#{tid},#{fid})")
	int insert(Tagfavorite dp);

}
