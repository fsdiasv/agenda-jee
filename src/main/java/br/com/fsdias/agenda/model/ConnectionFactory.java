package br.com.fsdias.agenda.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/agenda-fj21";
	private String user = "root";
	private String pass = "1234";
	
	public Connection getConnection() {

		try {
			Class.forName(driver);
			return DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return null;
	}
}
