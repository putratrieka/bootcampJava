package latihan;

public class IterasiGanjilPosisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angka = 0;
		int batas = 10;
		int j =2;
		
		for (int i = 0; i < batas*2; i+=2) {
			angka = i+1;			
//			if (i == j) {
//				angka = angka*-1;
//				j = j+4;
//			}
//			if (i % 4 ==2) {
//				angka = angka*-1;
//			}
			System.out.printf("%4s",angka);
		}
	}

}
