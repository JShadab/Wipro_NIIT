
public class Test {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();

		int a = calculator.add(10, 3);
		System.out.println(a);

		int b = calculator.sub(10, 3);
		System.out.println(b);

		int c = calculator.mul(10, 3);
		System.out.println(c);

		int d = calculator.div(10, 3);
		System.out.println(d);

		calculator.greet();

	}

}
