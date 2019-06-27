package latihan;

public class ItersasiGanjilPosisi2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int angka = -1;
		int hasil;
		int batas = 10;
		int j = 1;
		int k = 2;
		
		for (int i = 0; i < batas; i++) {
			angka += 2;				
			if (i == j) {
				hasil = angka*-1;
				j = j+2;
			}else{
				hasil = angka;
			}
			
			if(i == k) {
				hasil = 999;
				k += 3;
			}
			
//			if (i % 4 ==2) {
//				angka = angka*-1;
//			}
			System.out.printf("%4s",hasil);
		}

	}

}
