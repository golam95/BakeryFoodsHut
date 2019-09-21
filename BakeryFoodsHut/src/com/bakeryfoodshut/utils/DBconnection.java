package com.bakeryfoodshut.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
	public static Connection getConnecttion() {
		Connection cons = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/bakeryfoodshut", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cons;
	}
	public static void main(String[] args) {
		System.out.println(getConnecttion());
	}
}
