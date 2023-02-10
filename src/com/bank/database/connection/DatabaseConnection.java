package com.bank.database.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	Connection conn = null;
	
	public Connection establishConnection() {
		String urlString = "jdbc:sqlserver://CS32-PC;database=MyDatabase;encrypt=true;trustServerCertificate=true";
		String userName = "sa";
		String password = "Admin@123";
		
		try {
			conn = DriverManager.getConnection(urlString, userName, password);
		} catch(Exception e) { }
		
		return conn;
	}
}
