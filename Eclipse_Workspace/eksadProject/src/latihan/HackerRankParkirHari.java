package latihan;

public class HackerRankParkirHari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String masuk = "5-jun-2019 07:18";
		String keluar= "5-jun-2019 22:31";
		
		String[] jamMasuk =masuk.split(" ");
		String[] jamKeluar =keluar.split(" ");
		
		String[] tanggalMasuk = jamMasuk[0].split("-");
		String[] tanggalKeluar = jamKeluar[0].split("-");
		
		String[] jamMasukSplit = jamMasuk[1].split(":");
		String[] jamKeluarSplit = jamKeluar[1].split(":");
		
		int totalHari = Integer.parseInt(tanggalKeluar[0])-Integer.parseInt(tanggalMasuk[0])-1;
		//int totalJam = Integer.parseInt(jamKeluarSplit[0]);
		int totalJam = (24 - Integer.parseInt(jamMasukSplit[0])) + Integer.parseInt(jamKeluarSplit[0]);
		//int totalJam = Integer.parseInt(jamKeluarSplit[0]) - Integer.parseInt(jamMasukSplit[0]);
		int totalMenit = Integer.parseInt(jamKeluarSplit[1]) - Integer.parseInt(jamMasukSplit[1]);
		//System.out.println("Lama Parkir : " + totalJam +" jam " + totalMenit + " menit");
		System.out.println(totalHari);
		System.out.println(24 - Integer.parseInt(jamMasukSplit[0]));
		System.out.println(Integer.parseInt(jamKeluarSplit[0]));
		
		if (Integer.parseInt(jamKeluarSplit[1])>0) {
			totalJam += 1;
		}
		
		int totalBayar = (((totalJam-1)*2000)+4000);
		//+totalHari*50000;
		
		System.out.println(totalBayar);
	}

}
