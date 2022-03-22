package p1;

import java.util.Arrays;

public class ArrayDemo1 {

	public static void main(String[] args) {

		int[] arr = new int[3];

		arr[0] = 13;
		arr[1] = 99;
		arr[2] = 68;

		System.out.println("Size of array: " + arr.length);

		// How to print array
		System.out.println(arr); // [I@156643d4

		// How to print array elements
		System.out.println(Arrays.toString(arr)); // [13, 99, 68]

		// How to access array elements
		System.out.println("=============== Using For Loop ========================");

		for (int i = 0; i < arr.length; i++) {

			int x = arr[i];

			System.out.println(x);
		}
		
		System.out.println("=============== Using ForEach Loop (array/Collection) ========================");

		for (int x : arr) {	

			System.out.println(x);
		}

	}

}
