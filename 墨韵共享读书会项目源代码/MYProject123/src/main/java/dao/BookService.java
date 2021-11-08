package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Book;
import myDB.DBUtil;

public class BookService {
	// 通过图书ID查找图书信息
	public Book findBookById(String id) throws Exception {
		// ArrayList<Book> list = new ArrayList<Book>();
		Connection con = DBUtil.getCon();
		Statement statement = con.createStatement();

		String sql = "select * from book where BookID='" + id + "'";
		System.out.println(sql);

		ResultSet resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			Book book = new Book();
			System.out.println(resultSet.getString(2));
			book.setCovePath(resultSet.getString(4));
			book.setTitle(resultSet.getString(2));
			book.setAuthor(resultSet.getString(3));
			book.setBookIntoduc(resultSet.getString(5));
			return book;
		}
		return null;
	}
}
