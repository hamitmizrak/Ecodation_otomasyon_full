package com.ecodation.database;

import java.sql.Connection;
import java.sql.DriverManager;

//@Log4j2
public class DatabaseConnection extends DatabaseInformation {

	// for mysql
	private String url = getUrl();
	private String user = getUserName();
	private String password = getUserPassword();

	// for Database connection
	private Connection connection;

	// singleton Design pattern
	private static DatabaseConnection instance;

	// singleton
	public static DatabaseConnection getInstance() {
		try {
			if (instance == null) {
				instance = new DatabaseConnection();
			} else if (instance.connection.isClosed()) {
				instance = new DatabaseConnection();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;
	}

	// parametresiz constructor private: amac dısardan yeni bir instance oluşturulmasına engellemek
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

	// getter and setter
	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public static void main(String[] args) {
		// DatabaseConnection connection = new DatabaseConnection();
		// System.out.println(connection);
	}

}
