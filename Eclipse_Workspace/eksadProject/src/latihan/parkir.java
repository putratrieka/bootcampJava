package latihan;

public class parkir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String masuk = "5-jun-2019 07:18";
		String keluar= "18-jun-2019 22:31";
		
		String[] jamMasuk =masuk.split(" ");
		String[] jamKeluar =keluar.split(" ");
		
		String[] tanggalMasuk = jamMasuk[0].split("-");
		String[] tanggalKeluar = jamKeluar[0].split("-");
		
		String[] jamMasukSplit = jamMasuk[1].split(":");
		String[] jamKeluarSplit = jamKeluar[1].split(":");
		
		int tglKeluar = Integer.parseInt(tanggalKeluar[0]);
		int tglMasuk = Integer.parseInt(tanggalMasuk[0]);
		
		int hourKeluar = Integer.parseInt(jamKeluarSplit[0]);
		int hourMasuk = Integer.parseInt(jamMasukSplit[0]);
		
		int menitKeluar = Integer.parseInt(jamKeluarSplit[1]);
		int menitMasuk = Integer.parseInt(jamMasukSplit[1]);
		
		int fullHari = 0;
		if ((tglKeluar - tglMasuk)>1) {
			fullHari = (tglKeluar - tglMasuk)-1;
		}else {
			fullHari =0;
		}
		
		int fullBiaya = fullHari*50000;
		int totalJamKeluar = 0;
		int extraJamKeluar = 0;
		
		if (menitKeluar >=1) {
			extraJamKeluar = 1;
		}else {
			extraJamKeluar = 0;
		}
		
		totalJamKeluar = hourKeluar + extraJamKeluar;
		
		int biayaPerJam = totalJamKeluar*2000;
		int pertamaMasuk = 0;
		int totalJamMasuk =0;
		if (24 - hourMasuk >1) {
			pertamaMasuk = 1;
			totalJamMasuk = (24 - hourMasuk)-1;
		}else {
			pertamaMasuk = 1;
			totalJamMasuk = 0;
		}
		
		int JamMasukBiaya = (pertamaMasuk*4000)+(totalJamMasuk*2000);

		int totalBayar = JamMasukBiaya + biayaPerJam + fullBiaya;
		System.out.println(totalBayar);

	}

}
