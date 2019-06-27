package latihan;

public class PisahTahun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tahun = "2019/06/18";
		String[] tahunSplit = tahun.split("/");
		
		for (int i = tahunSplit.length -1;i >= 0; i--) {
			System.out.println(tahunSplit[i]);
		}
//		System.out.println(tahunSplit[2]);
//		System.out.println(tahunSplit[1]);
//		System.out.println(tahunSplit[0]);
		
		
	}

}
