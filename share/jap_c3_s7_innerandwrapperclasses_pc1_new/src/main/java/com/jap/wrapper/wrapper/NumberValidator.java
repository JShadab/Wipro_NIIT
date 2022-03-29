package com.jap.wrapper.wrapper;

public class NumberValidator {

	// validation rules to be written
	public int validateNumber(String input) {

		if (input == null || input.isEmpty()) {

			return -1;
		}

		long num = Long.parseLong(input); // 896514231

		long sum = 0;

		for (int i = 1; i <= 10; i++) {

			long lastDigit = num % 10;

			sum = sum + lastDigit * i;

			num = num / 10;
		}

		return (sum % 11 == 0) ? 1 : 0;

	}
}
