package myDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 连接数据库
 * 
 * @author 胡超
 * @version V1.0
 */
public class DBUtil {
	public static String jdbcName = "com.mysql.cj.jdbc.Driver";
	public static String url = "jdbc:mysql://localhost:3306/user?useSSL=true&characterEncoding=utf-8&serverTimezone=GMT";
	public static String userName = "root";
	public static String userPwd = "123";
	public static Connection con;

	public static Connection getCon() throws Exception {
		Class.forName(jdbcName);
		con = DriverManager.getConnection(url, userName, userPwd);
		return con;

	}

	public static void closeCon() throws Exception {
		if (con != null) {
			// 关闭连接
			con.close();
		}
	}

}
