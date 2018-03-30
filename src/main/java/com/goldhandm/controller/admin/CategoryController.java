package com.goldhandm.controller.admin;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.goldhandm.entity.Category;
import com.goldhandm.service.admin.CategoryService;



@Controller("AdminCategoryController")
@RequestMapping("/admin/category/")
public class CategoryController {

	@Autowired
	private CategoryService service;
	
	@RequestMapping("list")
	public String list() {
		
		return "admin.category.list";
	}
	
	@RequestMapping("detail")
	public String detail() {
		
		return "adimin.category.detail";
	}
	
	@RequestMapping("edit")
	public String edit() {
		
		return "admin.category.edit";
	}
	
	@RequestMapping(value="reg", method=RequestMethod.GET)
	public String reg() {
		
		return "admin.category.reg";
	}
	
	@RequestMapping(value="reg", method=RequestMethod.POST)
	public String reg(Category category, MultipartFile file, HttpServletRequest request) {
		
		String memberId ="kyr";
		
		ServletContext ctx = request.getServletContext();
		String path = ctx.getRealPath("/resources/category/"+memberId);
		File f = new File(path);
		if(!f.exists())
			f.mkdir();
		
		if(!file.isEmpty()) {
			
			
			try {
				String fname = file.getOriginalFilename();
				InputStream fis = file.getInputStream();
				FileOutputStream fos = new FileOutputStream(path+File.separator+fname);
			
				int size = 0;
				byte[] buf = new byte[1024];
				
				while((size = fis.read(buf,0,1024))!=-1)
					fos.write(buf,0,size);
				
				fis.close();
				fos.close();
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		service.insertCategory(category);
		
		
		return "redirect:list";
	}
	
	@RequestMapping("data")
	@ResponseBody//뷰로리턴하는게 아니라 리턴값으로 *출력*
	public String data() {
		
		return "안녕하세욤";
	}
	
}
