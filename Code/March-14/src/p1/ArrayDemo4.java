package p1;

import java.util.Arrays;

// How to Reverse an arrays
public class ArrayDemo4 {

	public static void main(String[] args) {

		String[] fruits = { "Apple", "Banana", "Mango", "Cheeku", "Guava", "Cocunut" };

		int N = fruits.length;

		System.out.println(Arrays.toString(fruits));

		for (int i = 0; i < N / 2; i++) {

			String first = fruits[i];
			String last = fruits[N - 1 - i];

			fruits[i] = last;
			fruits[N - 1 - i] = first;

		}

		System.out.println(Arrays.toString(fruits));

	}

}
