package p1;

import java.util.Arrays;

// How to Reverse an arrays
public class ArrayDemo3 {

	public static void main(String[] args) {

		String[] fruits = { "Apple", "Banana", "Mango", "Cheeku", "Guava", "Cocunut" };

		int N = fruits.length; 
		
		System.out.println(Arrays.toString(fruits));

		String[] reverse1 = new String[N];

		for (int i = 0; i < N; i++) {

			reverse1[N - 1 - i] = fruits[i];
		}

//		int index = 0;
//		
//		for(int i = (fruits.length-1) ; i >=0 ; i--) {
//			
//			reverse1[index++]=fruits[i];
//			
//			//System.out.println(fruits[i]);
//		}

		System.out.println(Arrays.toString(reverse1));

	}

}
