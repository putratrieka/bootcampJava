package latihan;

public class ArrayImpian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] usia = new int[3];
		String[] negara = new String[3];
		
		usia[0] = 26;
		usia[1] = 32;
		usia[2] = 35;
		
		negara[0] = "Belanda";
		negara[1] = "Jerman";
		negara[2] = "Inggris";
		
		for (int i = 0; i < usia.length; i++) {
			System.out.println(usia[i]);
			System.out.println(negara[i]);
		}
		
	}
}
