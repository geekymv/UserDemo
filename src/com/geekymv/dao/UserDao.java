package com.geekymv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.geekymv.pojo.User;
import com.geekymv.util.DBUtil;

/**
 * 用户Dao
 * @desc: UserDemo
 * @author: miying
 * @createTime: 2015年7月25日 下午9:22:40
 * @history:
 * @version: v1.0
 */
public class UserDao {
	
	/**
	 * 查询所有用户
	 *
	 * @author: miying
	 * @createTime: 2015年7月25日 下午9:23:31
	 * @history:
	 * @return List<User>
	 */
	public List<User> queryAll() {
		String sql = "select u.id, u.username, u.password from t_users u";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			// 创建List集合，用户存放查询出来的用户列表
			List<User> users = new ArrayList<User>();
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String uname = rs.getString("username");
				String pass = rs.getString("password");
				User user = new User(id, uname, pass);
				
				users.add(user);
			}
			
			return users;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.colose(rs, ps, conn);
		}
		
		return null;
	}
	
	/**
	 * 分页查询用户列表
	 *
	 * @author: miying
	 * @createTime: 2015年7月25日 下午9:24:25
	 * @history:
	 * @param pageSize
	 * @param currentPage
	 * @return List<User>
	 */
	public List<User> queryByPage(int pageSize, int currentPage) {
		// TODO
		return null;
	}
	
	/**
	 * 根据用户名和密码查询
	 *
	 * @author: miying
	 * @createTime: 2015年7月25日 下午9:22:51
	 * @history:
	 * @param username
	 * @param password
	 * @return User
	 */
	public User queryByUsernameAndPassword(String username, String password) {
		String sql = "select u.username, u.password from t_users u where u.username = ? and u.password = ?";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				String uname = rs.getString("username");
				String pass = rs.getString("password");
				User user = new User(uname, pass);
				return user;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.colose(rs, ps, conn);
		}
		
		return null;
	}

	/**
	 * 添加用户
	 *
	 * @author: miying
	 * @createTime: 2015年7月25日 下午10:12:15
	 * @history:
	 * @param user void
	 */
	public int addUser(User user) {
		String sql = "insert into t_users(username, password) values(?, ?)";
		
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			
			int res = ps.executeUpdate();
			
			return res;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.colose(rs, ps, conn);
		}
		
		return 0;
		
	}

}
