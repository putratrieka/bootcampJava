package latihan;

public class IterasiPosisiGanjilAngka3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int posisi = 1;
		int hasil = 0;
		int angka = 1;
		int batas = 10;
		
		for (int i = 0; i < batas; i++) {
			if (posisi == 1) {
				hasil = angka;
				posisi += 1;
			}else if (posisi == 2){
				hasil = angka*-1;
				posisi = 1;
			}
			
					
			angka += 2;	
			System.out.printf("%4s",hasil);
				
		}

	}

}
