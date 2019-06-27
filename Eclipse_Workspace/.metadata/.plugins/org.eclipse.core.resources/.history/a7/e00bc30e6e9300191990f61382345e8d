package com.eksad.training;

import com.eksad.training.bean.Bos;
import com.eksad.training.bean.Motor;
import com.eksad.training.bean.MotorKopling;
import com.eksad.training.bean.MotorMatic;

public class JalanRaya {
	public static void main(String[] args) {
		Motor[] arrMotor = new Motor[3];
		
		
		Motor motor = new Motor();//instantiate
		MotorMatic motorMatic = new MotorMatic();
		MotorKopling motorKopling = new MotorKopling();
		arrMotor[0] = motor;
		
		motor.setMerk("honda");
		motorMatic.setMerk("Maspion");
		arrMotor[1] = motorMatic;
		
		motorKopling.setMerk("rinai");
		
		arrMotor[2] = motorKopling;
		
		
//		for (Motor currentMotor : arrMotor) {
//			if(currentMotor instanceof MotorKopling) {// 
//				System.out.println(currentMotor.getMerk()); 
//				MotorKopling kopling = (MotorKopling) currentMotor;// cast
//				//((MotorKopling) currentMotor).masukinGigi();
//				System.out.println(kopling.masukinGigi());;
//			}
//			System.out.println(currentMotor.maju());
//		}
		
		Bos bos = new Bos();
		bos.naikKendaraan(motorMatic);
//		System.out.println(motor.maju());
//		System.out.println(motorMatic.maju());
//		//System.out.println(motorKopling.masukinGigi());
//		System.out.println(motorKopling.maju());
		
	}

}
