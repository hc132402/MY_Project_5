package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import model.User;
import myDB.DBUtil;

public class UserDao {

	public UserDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 根据用户名查询数据库中用户的所有信息
	public static User setUserMess(String username) throws Exception {
		Connection con = DBUtil.getCon();
		Statement statement = con.createStatement();

		String sql = "select * from user where name='" + username + "'";
		System.out.println(sql);
		ResultSet resultSet = statement.executeQuery(sql);
		User user = new User();
		while (resultSet.next()) {

			user.setName(resultSet.getString(1));
			user.setPassword(resultSet.getString(2));
			user.setSex(resultSet.getString(3));
			user.setAge(resultSet.getString(4));
		}
		return user;
	}
}
