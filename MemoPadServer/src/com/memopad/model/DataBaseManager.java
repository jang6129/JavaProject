package com.memopad.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseManager {
	Connection conn;
	Statement stmt;

	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // MySQL ����̹� �ε�
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "doma6591");

			System.out.println("DB ���� �Ϸ�");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����" + e.getMessage());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			System.out.println("DB ���� ����");
		}
	}

	public void selectAll() {
		try {
			stmt = conn.createStatement();
			ResultSet srs = stmt.executeQuery("select * from user");
			printData(srs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void printData(ResultSet srs) throws SQLException {
		while (srs.next()) {
			System.out.print(new String(srs.getString("ID")));
			System.out.print(" ");
			System.out.println(new String(srs.getString("PW")));
		}
	}
	
	public void insert(String ID, String PW) {
		try {
			stmt = conn.createStatement(); // SQL�� ó���� Statement ��ü ����
			stmt.executeUpdate("insert into user (ID, PW) values('" + ID + "', '" + PW + "');");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		DataBaseManager dataBaseManager = new DataBaseManager();
		dataBaseManager.connect();
//		dataBaseManager.insert("jjj", "152");
		dataBaseManager.selectAll();
	}
}
