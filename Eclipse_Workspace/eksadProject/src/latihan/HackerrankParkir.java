package latihan;

public class HackerrankParkir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jamMasuk = "07:18";
		String jamKeluar = "22:31";

		
		String[] jamMasukSplit = jamMasuk.split(":");
		String[] jamKeluarSplit = jamKeluar.split(":");
		
		int totalJam = Integer.parseInt(jamKeluarSplit[0]) - Integer.parseInt(jamMasukSplit[0]);
		int totalMenit = Integer.parseInt(jamKeluarSplit[1]) - Integer.parseInt(jamMasukSplit[1]);
		System.out.println("Lama Parkir : " +totalJam +" jam " + totalMenit + " menit");
		
		if (totalMenit>0) {
			totalJam += 1;
		}

		int totalBayar = ((totalJam-1)*2000)+4000;
		
		System.out.println("Biaya Parkir: "+totalBayar);

	}

}
