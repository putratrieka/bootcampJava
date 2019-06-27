package dasar;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 4;
		
		// deklarasi array
		int[] y = new int[2]; 
		y[0] = 300;
		y[1] = 700;
		int tambah = y[0]+y[1];
		
		String[] buah = new String[3];
		buah[0] = "MANGGA";
		buah[1] = "APEL";
		buah[2] = "TANGAN";
		
		
		
		//System.out.println(buah[1]);
		for (int i = 0; i < buah.length; i++) {
			System.out.println(buah[i]);
		}

	}

}
