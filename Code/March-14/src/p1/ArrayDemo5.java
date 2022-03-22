package p1;

// How to Reverse an arrays
public class ArrayDemo5 {

	public static void main(String[] args) {

		int[][] arr = new int[3][]; // It will store 3 array of different lengths

		int[] a1 = { 11, 99, 73, 49 };
		int[] a2 = { 15, 67, 59 };

		int[] a3 = new int[8];
		a3[0] = 6;

		arr[0] = a1;
		arr[1] = a2;
		arr[2] = a3;

	//	System.out.println(Arrays.toString(arr)); // [[I@1c4af82c, [I@379619aa, [I@cac736f]
		
		for (int i = 0; i < arr.length; i++) {		

			for (int j = 0; j < arr[i].length; j++) {
				
				int val = arr[i][j];
				
				System.out.print(val +", ");
				
			}
			
			System.out.println();
			
		}

	}

}
