package com.geekymv.service;

import java.util.List;

import com.geekymv.dao.UserDao;
import com.geekymv.pojo.User;
/**
 * 用户Service
 * @desc: LoginDemo
 * @author: miying@iflytek.com
 * @createTime: 2015年7月19日 下午3:50:14
 * @history:
 * @version: v1.0
 */
public class UserService {
	/**
	 * 用户Dao
	 */
	private UserDao userDao;
	
	public UserService() {
		this.userDao = new UserDao();
	}
	
	/**
	 * 用户登录
	 *
	 * @author: miyin
	 * @createTime: 2015年7月19日 下午3:07:01
	 * @history:
	 * @param username
	 * @param password
	 * @return User
	 */
	public User login(String username, String password) {
		return userDao.queryByUsernameAndPassword(username, password);
	} 
	
	/**
	 * 用户列表
	 *
	 * @author: miying
	 * @createTime: 2015年7月25日 下午9:28:01
	 * @history:
	 * @return List<User>
	 */
	public List<User> getAllUser() {
		return userDao.queryAll();
	}

	/**
	 * 添加用户
	 *
	 * @author: miying
	 * @createTime: 2015年7月25日 下午10:11:29
	 * @history:
	 * @param user void
	 */
	public int addUser(User user) {
		return userDao.addUser(user);
	}
	
}
