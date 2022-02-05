package com.ecodation.database;

import java.sql.Connection;
import java.sql.DriverManager;

//@Log4j2
public class DatabaseConnection extends DatabaseInformation {
	// singleton Design pattern
	private static DatabaseConnection instance;

	// for mysql
	private String url = getUrl();
	private String user = getUserName();
	private String password = getUserPassword();

	// for Database connection
	private Connection connection;

	private DatabaseConnection() {
		try {
			Class.forName(getForNameData());
			System.out.println("Driver success");
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Database connected ");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("!!!! Database bağlantı sırasında basarısız olundu");

		}
	}

	public static void main(String[] args) {
		DatabaseConnection connection = new DatabaseConnection();
		System.out.println(connection);
	}

}
