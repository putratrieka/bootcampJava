package com.eksad.training;

import com.eksad.training.bean.Motor;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = new Integer(2);
		Integer b = new Integer(2);
		
		int as = 2;
		int ad = 2;
		
		
		//int b = 2;
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		Motor motor1 = new Motor();
		motor1.setMerk("Honda"); 
		motor1.setCc(125);
		motor1.setTahunPembuatan(2018);
		Motor motor2 = new Motor();
		motor2.setMerk("Honda");
		motor2.setCc(125);
		motor2.setTahunPembuatan(2018);

		System.out.println(motor1 == motor2);
		System.out.println(motor1.equals(motor2));
	}

}
