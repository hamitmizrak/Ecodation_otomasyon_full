package com.ecodation.util;

import java.sql.Connection;
import java.util.ArrayList;

import com.ecodation.database.DatabaseConnection;

public interface IDaoConnection<T> {

	// CRUD
	public void create(T t);

	public void update(T t);

	public void delete(T t);

	public ArrayList<T> list();

	// govdesiz metot
	default Connection getInterfaceConnection() {
		return DatabaseConnection.getInstance().getConnection();
	}

}
