package com.eksad.latihanjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.eksad.latihanjdbc.model.Employee;

public class EmployeeSerivice {
	private static final String URL = "jdbc:postgresql://localhost:5432/eksaddb";
	private static final String USERNAME = "postgres";
	private static final String PASSWORD = "postgres";
	
	public Connection conn() {
		try {
			Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Koneksi Berhasil");
			return connection;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Koneksi Gagal");
			e.printStackTrace();
			return null;
		}
	}
	//==============================================================================
	// mengambil data dari database
	public void getAll() {
		
		try {
			Connection con = conn();
			Statement st;
			st = con.createStatement();
			String sql ="SELECT * FROM employee";
			ResultSet result = st.executeQuery(sql);
			
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				Date dob = result.getDate("dob");
				String address = result.getString("address");
				
				System.out.print("ID: "+id +"; ");
				System.out.print("Name: "+name+"; ");
				System.out.print("DOB: "+dob+"; ");
				System.out.print("Address: "+address+"; ");		
				
			}
			result.close();
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	//==============================================================================
	// insert 
	public void getById(Employee employee) {
		try {
			Connection con = conn();// koneksi ke database
			Statement st;
			st = con.createStatement();
			String sql = "SELECT * FROM employee "
						+ "WHERE id="+employee.getId(); // syntax query
			ResultSet result = st.executeQuery(sql); // excecute syntax query
			
			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				Date dob = result.getDate("dob");
				String address = result.getString("address");
				
				System.out.print("ID: "+id +"; ");
				System.out.print("Name: "+name+"; ");
				System.out.print("DOB: "+dob+"; ");
				System.out.print("Address: "+address+"; ");		
				
			}
			result.close();
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void getName(String name) {
		try {
			Connection con = conn();
			Statement st;
			st = con.createStatement();
			String sql = "SELECT * FROM employee WHERE name="+"'"+name+"'"; // query
			ResultSet result = st.executeQuery(sql);
			
			while (result.next()) {
				int id = result.getInt("id");
				name = result.getString("name");
				Date dob = result.getDate("dob");
				String address = result.getString("address");
				
				System.out.print("ID: "+id +"; ");
				System.out.print("Name: "+name+"; ");
				System.out.print("DOB: "+dob+"; ");
				System.out.print("Address: "+address+"; ");		
				
			}
			result.close();
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Query error");
			e.printStackTrace();
		}	
	}
//=====================================================================================	
//	public void save(String name, String dob,String address, int age) {
//		try {
//			Connection con = conn();
//			Statement st;
//			st = con.createStatement();
//			
//			String sql = "INSERT INTO employee ("
//					+ "name,dob,address,age"
//					+ ")"
//					+ "VALUES("
//					+ "'"+name+"',"
//					+ "'"+dob+"',"
//					+ "'"+address+"',"
//					+ "'"+age+"')"; // query
//			int result = st.executeUpdate(sql);// Update data base
//			
//			System.out.println("data berhasil disimpan");
//			st.close();
//			con.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Query error");
//			e.printStackTrace();
//		}		
//	}
	
	public void save(Employee employee){
		try {
			Connection con = conn();
			Statement st;
			st = con.createStatement();
			
			String sql = "INSERT INTO employee ("
					+ "name,dob,address"
					+ ")"
					+ "VALUES("
					+ "'"+employee.getName()+"',"
					+ "'"+employee.getDob()+"',"
//					+ "'"+employee.getAddress()+"',"
					+ "'"+employee.getAddress()+"')"; // query
			int result = st.executeUpdate(sql);// Update data base
			
			System.out.println("data berhasil disimpan");
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Query error");
			e.printStackTrace();
		}		
	}

	
	public void updateData( int id,String nama,String address) {
		try {
			Connection con = conn();
			Statement st;
			st = con.createStatement();
			String sql = "UPDATE employee"
					+ " SET name='"+nama+"',address='"+address+"'"
					+ " WHERE id="+id;
			int result = st.executeUpdate(sql);// Update data base
			
			System.out.println("data berhasil disimpan");
			st.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Query error");
			e.printStackTrace();
		}	

		
	}
}
