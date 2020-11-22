package com.richcoder.code.generate.util;


import java.sql.*;
import java.util.Properties;

public class DBUtil {

	private static String driverClassName = "com.mysql.jdbc.Driver";
	private static String url = "jdbc:mysql://localhost:3306/test";
	private static String username = "root";
	private static String password = "root";

	static{
		Properties p = PropertiesUtil.loadProperties(null, "jdbc");
		driverClassName = p.getProperty("database.driverClassName");
		url = p.getProperty("database.url");
		username = p.getProperty("database.username");
		password = p.getProperty("database.password");
	}

	public static Connection getConnection() {
		try {
			Class.forName(driverClassName);
			Properties props =new Properties();
			props.setProperty("user", username);
            props.setProperty("password", password);
            props.setProperty("remarks", "true"); //设置可以获取remarks信息 
            props.setProperty("useInformationSchema", "true");//设置可以获取tables remarks信息
			
			Connection conn = DriverManager.getConnection(url, props);
			return conn;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(ResultSet rs, Statement stmt,
			Connection conn) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		getConnection();
	}

}
