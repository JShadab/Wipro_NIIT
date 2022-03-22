package p1;

import java.util.Arrays;

// How to Merge two arrays
public class ArrayDemo2 {

	public static void main(String[] args) {

		String[] fruits = { "Apple", "Banana", "Mango", "Cheeku" };
		String[] flowers = { "Rose", "SunFlower", "lotus", "Jasmine", "daffodil" };

		String[] arr = new String[fruits.length + flowers.length];

		for (int i = 0; i < fruits.length; i++) {

			arr[i] = fruits[i];
		}

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < flowers.length; i++) {

			arr[fruits.length+ i] = flowers[i];
		}
		System.out.println(Arrays.toString(arr));

	}

}
