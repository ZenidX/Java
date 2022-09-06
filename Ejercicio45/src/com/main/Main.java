package com.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	static Connection connection;
	public static void main(String[] args) {
		
		final String url = "jdbc:mysql://localhost:3306/db_test";
		final String user = "root";
		final String pass = "DoomEternal";
		connection = createConnection(url, user, pass);
		try {

			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("SELECT * FROM db_test.usuarios");
			ResultSetMetaData rsmd = result.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i = 1; i < columnCount; i++) {
				System.out.printf("%10s", rsmd.getColumnName(i).toString());
			}
			int spacing = ((columnCount * 10) - 5);
			String textoFormateado = String.format("%n%" + spacing + "s", " ", " ").replace(' ', '-');
			System.out.println(textoFormateado);
			while (result.next()) {
				int id_usuarios = result.getInt("id_usuarios");
				String nombre = result.getString("Nombre");
				int edad = result.getInt("Edad");
				System.out.printf("%10d%10s%10d%n", id_usuarios, nombre, edad);
			}
			result.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public static Connection createConnection(String url, String user, String pass) {
		Connection cn = null;
		try {
			cn = DriverManager.getConnection(url, user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}

	public void Create(Connection connection) {
//		Statement statement = connection.createStatement();
//		ResultSet result = statement.executeQuery("SELECT * FROM db_test.usuarios");

	}

	public void Read() {

	}

	public void Update() {

	}

	public void Delete() {

	}
}