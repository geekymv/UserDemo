package com.geekymv.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.geekymv.pojo.User;
import com.geekymv.service.UserService;
import com.google.gson.Gson;
/**
 * 用户Controller
 * @desc: UserDemo
 * @author: miying@iflytek.com
 * @createTime: 2015年7月25日 下午9:08:56
 * @history:
 * @version: v1.0
 */
public class UserController extends HttpServlet{
	private static final long serialVersionUID = 2297432045852339362L;
	
	/**
	 * 获取用户列表数据
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// 设置编码-解决中文乱码
		resp.setCharacterEncoding("utf-8");
		
		UserService userService = new UserService();
		
		List<User> users = userService.getAllUser();
		
		Gson gson = new Gson();
		String userJson = gson.toJson(users);	// 将List<User>集合中的User转换成json格式的字符串数据
		
//		System.out.println(userJson);
		
		// 将json格式的用户列表返回的浏览器端
		PrintWriter out = resp.getWriter();
		out.write(userJson);
	}

}
