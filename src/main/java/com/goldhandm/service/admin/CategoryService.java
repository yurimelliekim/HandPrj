package com.goldhandm.service.admin;

import org.springframework.beans.factory.annotation.Autowired;

import com.goldhandm.dao.CategoryDao;
import com.goldhandm.entity.Category;

public class CategoryService {
	@Autowired
	private CategoryDao categoryDao;
	public int insertCategory(Category category) {
		
		categoryDao.insert(category);
		return 0;
	}

}
