package com.gl.fsd.gl_fsd_mvc_assign.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.gl.fsd.gl_fsd_mvc_assign.bean.Student;

@Controller
public class HomeController {

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	
	@RequestMapping(value="/students")
	public ModelAndView studentsList(HttpServletResponse response) throws IOException{
		
		return new ModelAndView("students");
	}
	
	
	@RequestMapping(method = RequestMethod.POST,value = "/addstudent")
	public ModelAndView addStudent(HttpServletResponse response,@ModelAttribute("student") Student student) throws IOException{
		
		return new ModelAndView("addstudent");
	}
}
