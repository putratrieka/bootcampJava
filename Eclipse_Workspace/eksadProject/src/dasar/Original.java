package dasar;

public class Original {
	
	public void hitung() {
		int b = 9;
		System.out.println("HITUNG");
	}
	
	public void tambah() {
		System.out.println("TAMBAH");
	}
	
	public static void main(String[] args) {
		//Instance class -> memanggil class
		Original original = new Original();
		original.tambah();
	}
}
