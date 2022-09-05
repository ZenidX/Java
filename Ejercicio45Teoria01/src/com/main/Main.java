package com.main;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	public static void main(String[] args) {
		Connection connection;
		final String url = "jdbc:mysql://localhost:3306/db_test";
		final String user = "root";
		final String pass = "DoomEternal";
		try {
			connection = DriverManager.getConnection(url, user, pass);
			System.out.println("Connection success.");
			connection.close();
			System.out.println("Connection closed.");
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}