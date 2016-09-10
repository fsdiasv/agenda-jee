package br.com.fsdias.agenda.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	private String driver = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/agenda-fj21";
	private String user = "loot";
	private String pass = "1234";
	
	public Connection getConnection() throws ClassNotFoundException {

			Class.forName(driver);

			try {
				return DriverManager.getConnection(url, user, pass);
			} catch (SQLException e) {
				throw new RuntimeException();
			}
	}
}
