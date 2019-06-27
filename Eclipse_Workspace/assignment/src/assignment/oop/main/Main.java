package assignment.oop.main;

import assignment.oop.Activity;
import assignment.oop.Millennials;
import assignment.oop.Female;
import assignment.oop.Human;

public class Main {
	public static void main(String[] args) {
		//Instantiate variabel human
		Human human = new Human();
		//Instantiate variabel activity
		Activity activity = new Activity();

		human.setName("Bambang");
		human.setAge(23);
		human.setEyeColor("Coklat");
		human.setSkinColor("Sawo Matang");	
		
		//Instantiate variabel female
		Female female = new Female();
		female.setName("Manis");
		female.setAge(55);
		female.setSkinColor("putih");
		female.setEyeColor("hijau");
		
		// memanggil method speaking pada class Activity
		activity.speaking(female);	
		System.out.println(activity.getSpeak());
		System.out.println("============================");
		System.out.println(female.selfie());
		System.out.println(female.walk());
		
		System.out.println("============================");	
		
		//Instentiate millennials
		Millennials millennials = new Millennials();
		//memanggil method otw pada class millennials
		millennials.otw(female);
	}
}
