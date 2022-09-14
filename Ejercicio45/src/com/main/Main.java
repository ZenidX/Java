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
		try{
			connection = DriverManager.getConnection(url, user, pass);
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
			while (result.next()){
				int id_usuarios=result.getInt("id_usuarios");
				String nombre=result.getString("Nombre");
				int edad=result.getInt("Edad");
				System.out.printf("%10d%10s%10d%n", id_usuarios, nombre, edad);
			}
			result.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	public String PROTOCOLO_CREATE(){
		String table="db_test";
		String[] variab = {"Argo"  ,"Petardo"};
		String[] values = {"patata","patata" };
		return Create(table,variab,values);
	}
	public String Create(String table,String[] variab,String[] values){
		String QUERY = "INSERT INTO ";
		QUERY=QUERY+table+" VALUES (";
		for(int a=0;a<variab.length;a++){
			QUERY=QUERY+variab[a]+", ";
		}
		char[] charQUERY=QUERY.toCharArray();
		charQUERY[charQUERY.length-1]=')';
		QUERY=charQUERY.toString();
		QUERY=QUERY+" VALUES (";
		for(int a=0;a<values.length;a++) {
			QUERY=QUERY+values[a]+", ";
		}
		charQUERY=QUERY.toCharArray();
		charQUERY[charQUERY.length-1]=')';
		QUERY=charQUERY.toString()+";";
		return QUERY;
	}
	public String PROTOCOLO_READ(){
		String table="db_test";
		String[] variab = {"Argo"  ,"Petardo"};
		return Read(table, variab);
	}
	public String Read(String table,String[] variab){
		String QUERY = "SELECT ";
		for(int a=0;a<variab.length;a++){
			QUERY=QUERY+variab[a]+", ";
		}
		char[] charQUERY=QUERY.toCharArray();
		charQUERY[charQUERY.length-1]=' ';
		QUERY=charQUERY.toString();
		QUERY=QUERY+" FROM "+table+";";
		return QUERY;
	}
	public String PROTOCOLO_UPDATE(){
		String table="db_test";
		String[] variab = {"Argo"  ,"Petardo"};
		String[] values = {"patata","patata" };
		return Update(table,variab,values);
	}
	public String Update(String table, String[] variab, String[] values){
		String QUERY = "UPDATE ";
		for(int a=0;a<variab.length;a++){
			QUERY=QUERY+variab[a]+", ";
		}
		char[] charQUERY=QUERY.toCharArray();
		charQUERY[charQUERY.length-1]=' ';
		QUERY=charQUERY.toString();
		
	}
	public void Delete(){
		
	}
}