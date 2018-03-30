package com.goldhandm.dao.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.goldhandm.dao.CategoryDao;
import com.goldhandm.entity.Category;

public class MyBatisCategoryDao implements CategoryDao {

	@Autowired
	private SqlSession sqlSession;
	@Override
	public List<Category> getList(Integer page) {
		CategoryDao categoryDao = sqlSession.getMapper(CategoryDao.class);
		List<Category> result = categoryDao.getList(page);
		return result;
	}

	@Override
	public Category get(Integer id) {
		CategoryDao categoryDao = sqlSession.getMapper(CategoryDao.class);
		Category result = categoryDao.get(id);
		return result;
	}

	@Override
	public int insert(Category category) {
		CategoryDao categoryDao = sqlSession.getMapper(CategoryDao.class);
		int result = categoryDao.insert(category);
		return result;
	}

}
