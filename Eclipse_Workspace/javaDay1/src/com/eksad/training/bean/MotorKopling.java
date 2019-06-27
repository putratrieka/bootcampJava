package com.eksad.training.bean;

public class MotorKopling extends Motor{
	private boolean gigiMasuk ;
	
	public String masukinGigi() {
		gigiMasuk = true;
		try {
			Integer[] integer= new Integer[2];
			System.out.println(integer[4]);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "jegreg";
	}
	

	@Override
	public String maju() {
		// TODO Auto-generated method stub
		if (gigiMasuk) {
			return super.maju();
		}else {
			return "..............";
		}
	}
}
