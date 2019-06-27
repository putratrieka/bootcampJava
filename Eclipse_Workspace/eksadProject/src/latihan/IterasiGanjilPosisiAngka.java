package latihan;

public class IterasiGanjilPosisiAngka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angka = 0;
		int j = 2;
		int k = 4;
		for (int i = 0; i < 20; i+=2) {
			//System.out.printf("%5s",i);
			angka = i+1;
			if (i == j) {
				angka = angka*-1;
				j += 4;
			}
//			if ((i%3) == 1) {
//				angka = 999;
//			}
			if (i == k) {
				angka = 999;
				k += 6;
			}
			System.out.printf("%5s",angka);			
		}
	}

}
