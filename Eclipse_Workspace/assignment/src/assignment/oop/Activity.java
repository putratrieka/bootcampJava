package assignment.oop;

public class Activity {
	private String work;
	private String eat;
	private String speak = "";
	
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getEat() {
		return eat;
	}
	public void setEat(String eat) {
		this.eat = eat;
	}
	public void speaking(Human human) {
		speak = speak +"Nama saya "+ human.getName()+","+"\n";
		speak = speak +"Umur saya "+ human.getAge() + " tahun"+","+"\n";
		speak = speak + "bola mata saya berwarna "+human.getEyeColor();
	}
	public String getSpeak() {
		return speak;
	}
	
	

}
