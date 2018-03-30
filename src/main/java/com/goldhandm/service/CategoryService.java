package com.goldhandm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.goldhandm.dao.CategoryDao;
import com.goldhandm.entity.Category;

public class CategoryService {

	@Autowired
	private CategoryDao categoryDao;
	
	public List<Category> getCategoryList(Integer page) {
		
		List<Category> list = categoryDao.getList(page);
		return list;
	}

	public Category getCategory(Integer id) {
		categoryDao.get(id);
		return null;
	}

}
