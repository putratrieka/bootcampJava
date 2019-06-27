package com.eksad.training.bean;

public class Motor implements Kendaraan{
//	private int cc;
//	private String merk;
//	private Integer tahunPembuatan;
	
	// agar dapat diakses oleh Inheritancenya gunakan "protected"
	protected int cc;
	protected String merk;
	protected Integer tahunPembuatan;
	
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public String getMerk() {
		return merk;
	}
	public void setMerk(String merk) {
		this.merk = merk;
	}
	public Integer getTahunPembuatan() {
		return tahunPembuatan;
	}
	public void setTahunPembuatan(Integer tahunPembuatan) {
		this.tahunPembuatan = tahunPembuatan;
	}
	public String maju() {
		return "Motor "+merk+": brum brum";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (!(obj instanceof Motor)) 
			return false;
			Motor motor = (Motor) obj;
		if (this.getMerk().equals(motor.getMerk()))
			return true;
		else
			return false;
		
		
	}
	

}
