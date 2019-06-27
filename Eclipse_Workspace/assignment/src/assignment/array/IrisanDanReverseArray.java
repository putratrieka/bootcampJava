package assignment.array;

public class IrisanDanReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrA = new int[] {1,2,4,5,7,8,9};
		int[] arrB = new int[] {2,3,4,5,6,7,9};

		//irisan array
		System.out.print("Irisan Array A dan Array B adalah : ");
		for (int i = 0; i < arrA.length; i++) {
			for (int j = 0; j < arrB.length; j++) {
				if(arrA[i] ==arrB[j]) {
					System.out.print(arrA[i]+" ");
					break;
					
				}
			}
		}
		System.out.println();
		System.out.println("==================================");
		
		// array reverse
		System.out.print("Array A Reverse : ");
		for (int i = arrA.length-1;i>=0; i--) {
			System.out.print(arrA[i]+" ");
		}
		
		System.out.println();
		System.out.println("==================================");
		
		System.out.print("Array B Reverse : ");
		for (int i = arrB.length-1;i>=0; i--) {
			System.out.print(arrB[i]+" ");
		}

	}

}
