package com.eksad.training.bean;

public class Laptop {
	private String merk;
	private Integer berat;
	
	public Laptop(String merk) {
		super();
		this.merk = merk;
	}

	public String getMerk() {
		return merk;
	}

	public void setMerk(String merk) {
		this.merk = merk;
	}

	public Integer getBerat() {
		return berat;
	}

	public void setBerat(Integer berat) {
		this.berat = berat;
	}
	
	
	
	
}
