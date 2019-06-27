package com.eksad.training.bean;

public class Pensil {
	// object properties
	private String warna;
	private String tipe;
	private String panjang;
	
//constructor
	public Pensil() {
		
	}
	public Pensil(String warna) {
		// TODO Auto-generated constructor stub
		this.warna = warna;
		
	}
//-----------------------

	public String getWarna() {
		return warna;
	}	
	
	public void setWarna(String warna) {
		this.warna = warna;
	}

	public String getTipe() {
		return tipe;
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	}

	public String getPanjang() {
		return panjang;
	}

	public void setPanjang(String panjang) {
		this.panjang = panjang;
	}
	
}
