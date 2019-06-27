package latihan;

public class ArrayAngkaLipat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int batas = 10;
		int[] ganjil = new int[batas];
		int angka = 0;
		
		for (int i = 0; i < ganjil.length; i++) {
			angka = angka + 3;
			ganjil[i] = angka;
			System.out.printf("%5s",ganjil[i]);
		}
		System.out.println();
		angka = 0;
		for (int i = ganjil.length -1; i >=0 ; i--) {
			System.out.printf("%5s",ganjil[i]);
		}
		
		

	}

}
