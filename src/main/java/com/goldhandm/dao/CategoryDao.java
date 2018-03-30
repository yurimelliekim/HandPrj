package com.goldhandm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.goldhandm.entity.Category;

public interface CategoryDao {
	
	@Select("select * from Category limit ${(page-1)*30},30")
	List<Category> getList(@Param("page")Integer page);
		
	Category get(Integer id);

	int insert(Category category);

}
