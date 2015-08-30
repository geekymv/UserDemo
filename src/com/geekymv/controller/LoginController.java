package com.geekymv.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.geekymv.pojo.User;
import com.geekymv.service.UserService;
/**
 * 用户登录
 * @desc: LoginDemo
 * @author: miying@iflytek.com
 * @createTime: 2015年7月19日 下午3:50:50
 * @history:
 * @version: v1.0
 */
public class LoginController extends HttpServlet{
	private static final long serialVersionUID = -5295782797108961935L;
	
	/**
	 * 跳转到登录页面
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
//		System.out.println("path = " + req.getContextPath());
		
		resp.sendRedirect(req.getContextPath() + "/login.jsp");
	}

	/**
	 * 处理登录请求
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		/**
		 * 用户服务
		 */
		UserService userService = new UserService();
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
	
		User user = userService.login(username, password);
		
		if(user == null) {	// 登录失败，跳转到登录页面
			req.setAttribute("error", "用户名或密码错误！");
			req.getRequestDispatcher("/login.jsp").forward(req, resp); // 请求转发

		}else {	// 登录成功，跳转到成功页面
			// 登录成功，将用户信息放入session中
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			resp.sendRedirect(req.getContextPath()+"/users.jsp");
		}
		
	}
	

}
