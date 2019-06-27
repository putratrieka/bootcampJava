package dasar;

public class Konversi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		System.out.println(a+a);
		
		String b = "5";
		System.out.println(b+b);
		
		String tahun = "2019";
		int tahunAngka = Integer.parseInt(tahun);
		int hasil = tahunAngka + tahunAngka;
		System.out.println(hasil);
		
		
		String tahunHuruf = String.valueOf(hasil);
		System.out.println(tahunHuruf+tahunHuruf);
	}

}
