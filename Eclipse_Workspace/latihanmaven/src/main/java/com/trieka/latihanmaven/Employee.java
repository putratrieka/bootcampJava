package com.trieka.latihanmaven;

import java.sql.Connection;
import java.sql.DriverManager;

public class Employee {
	private static final String URL = "jdbc:postgresql://localhost:5432/eksaddb";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "posgreSQL";
	
	public Connection conn() {
		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Koneksi Berhasil");
			return connection;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("KOneksi Gagal");
			e.printStackTrace();
			return null;
		}
	}
}
