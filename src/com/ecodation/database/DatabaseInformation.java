package com.ecodation.database;

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
		this.url = "jdbc:mysql://localhost:3306/ecodation_2_otomasyon?useUnicode=true&characterEncoding=UTF-8&useLegacyDatetimeCode=false&serverTimezone=Turkey";
		this.forNameData = "com.mysql.cj.jdbc.Driver"; // mysql 8.0.16

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
