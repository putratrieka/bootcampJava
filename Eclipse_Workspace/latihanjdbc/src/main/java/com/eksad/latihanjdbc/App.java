package com.eksad.latihanjdbc;

import java.util.Scanner;

import com.eksad.latihanjdbc.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
        EmployeeSerivice employeeService = new EmployeeSerivice();
        Employee employee = new Employee();
        Scanner scan = new Scanner(System.in);
//        //employee.conn();
//        //employee.getAll();// memanggil method getAll pada class employee
//        //employee.getById(9);
//        //employee.getName("Mike");
//        //employee.save();
//        //employee.updateData(13,"Surya","Bandung");
//        
//        
//        System.out.println("Input Nama");
//        employee.setName(scan.nextLine());
//        System.out.println("Input Tanggal Lahir (yyyy-mm-dd)");
//        employee.setDob(scan.nextLine());
//        System.out.println("Input Alamat");
//        employee.setAddress(scan.nextLine());
//        System.out.println("Input Umur");
//        int age = scan.nextInt();     
        
        
//        employeeService.save(employee);
    	
    	System.out.println("Pilih Menu :");
    	System.out.println("1. Tampilkan Data Kayawan");// tampilka semua data
    	System.out.println("2. Cari Karyawan");
    	System.out.println("3. Input Karyawan");
    	System.out.println("===============");

    	String angkaTerpilih = scan.nextLine();
    	
    	if (angkaTerpilih.equals("1")) {
    		System.out.println("Data Karyawan");
    		System.out.println("====================");
    		employeeService.getAll();
    	}else if (angkaTerpilih.equals("2")) {
    		System.out.println("Cari Karyawan");
    		System.out.println("Input Id KAryawan");
    		employee.setId(scan.nextInt());
    		employeeService.getById(employee);
    	}else if(angkaTerpilih.equals("3")) {
    		System.out.println("Input Data Karaywan");
    		System.out.println("====================");
            System.out.println("Input Nama");
            employee.setName(scan.nextLine());
            System.out.println("Input Tanggal Lahir (yyyy-mm-dd)");
            employee.setDob(scan.nextLine());
            System.out.println("Input Alamat");
            employee.setAddress(scan.nextLine());
//            System.out.println("Input Umur");
//            int age = scan.nextInt();                
            employeeService.save(employee);
    	}else {
    		System.out.println("Anda Salah Pilih");
    	}
    	
        
    }
}
