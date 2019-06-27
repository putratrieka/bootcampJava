package latihan;

public class ArrayAngka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int batas = 10;
		int[] ganjil = new int[batas];
		int angka = 1;
		
		for (int i = 0; i < ganjil.length; i++) {
			ganjil[i] = angka;
			angka += 2;
		}
		
		for (int i = 0; i < ganjil.length; i++) {
			System.out.printf("%5s",ganjil[i]);
		}
		System.out.println();
		int indexTurun = 9;
		for (int i = 0; i < ganjil.length; i++) {
			System.out.printf("%5s",ganjil[indexTurun]);
			indexTurun -= 1;
		}
	}

}
