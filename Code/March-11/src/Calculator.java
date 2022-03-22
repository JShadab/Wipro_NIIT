
public class Calculator {

	int add(int a, int b) {

		int c = a + b;
		return c;
	}

	int sub(int a, int b) {

		int c = a - b;
		return c;
	}

	int mul(int a, int b) {

		int c = a * b;
		return c;
	}

	int div(int a, int b) {
		System.out.println("I am in division method");

		int c = a / b;
		return c;
	}

	static void greet() {
		System.out.println("Hello User, Thanks for using ME!!!");
	}

}
