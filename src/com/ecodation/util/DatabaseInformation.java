package com.ecodation.util;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DatabaseInformation {

	// for database connection
	private String userName;
	private String userPassword;
	private String url;
	private String forNameData;

	// parametresiz constructor
	public DatabaseInformation() {
		// for mysql
		this.userName = "root";
		this.userPassword = "root";
		this.forNameData = "com.mysql.jdbc.Driver";

		// for postgresql
		// this.userName = "root";
		// this.userPassword = "root";
		// this.forNameData = "org.postgresql.Driver";

	}

	// parametreli constructor
	public DatabaseInformation(String userName, String userPassword, String url, String forNameData) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.url = url;
		this.forNameData = forNameData;
	}

}
