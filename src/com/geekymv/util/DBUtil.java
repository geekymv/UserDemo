package com.geekymv.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBUtil {
	// 定义连接数据库
	private static Connection ct = null;
	// 定义操作数据库的类
	private static PreparedStatement ps = null;
	// 输出数据的类
	private static ResultSet rs = null;

	// 静态方式取得链接
	public static Connection getConnection() {
		// 数据库用户名
		String username = "root";
		// 数据库用户密码
		String passwd = "root";
		String url = "jdbc:mysql://localhost:3306/logindemo";
		// 获取驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			ct = DriverManager.getConnection(url, username, passwd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return ct;
	}
	
}
