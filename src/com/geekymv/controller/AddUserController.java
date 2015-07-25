package com.geekymv.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.geekymv.pojo.User;
import com.geekymv.service.UserService;

/**
 * 添加用户
 * @desc: UserDemo
 * @author: miying
 * @createTime: 2015年7月25日 下午10:07:20
 * @history:
 * @version: v1.0
 */
public class AddUserController extends HttpServlet {
	private static final long serialVersionUID = -3635583161021959438L;
	
	private UserService userService;
	
	/**
	 * 初始化userService
	 */
	@Override
	public void init() throws ServletException {
		this.userService = new UserService();
	}

	/**
	 * 跳转到添加用户页面
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		resp.sendRedirect(req.getContextPath()+"/addUser.jsp");
	}
	
	/**
	 * 处理添加用户请求
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 处理表单数据乱码
		req.setCharacterEncoding("utf-8");
		
		// 获取表单数据
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// 新建用户
		User user = new User(username, password);
		
		int res = userService.addUser(user);
		
		if(res == 1) {	// 添加成功
			// 跳转到用户列表页面
			resp.sendRedirect(req.getContextPath()+"/users.jsp");
			
		}else { // 添加失败
			req.setAttribute("message", "添加失败");
			req.getRequestDispatcher("/fail.jsp").forward(req, resp);
		}
	}
	
	
}
