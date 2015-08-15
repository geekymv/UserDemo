package com.geekymv.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegisterController extends HttpServlet {
	private static final long serialVersionUID = 2913352414595004639L;

	/**
	 * 跳转到用户祖册页面
	 */
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		request.getRequestDispatcher("/WEB-INF/views/register.jsp").forward(request, response);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		
		// checkbox form方式提交 可以用下面这种方式
//		String[] interests = request.getParameterValues("interests");
	
		String interests = request.getParameter("interests");
		
		// TODO 后台数据验证
		
		
		
		
		System.out.println(username);
	}

}
