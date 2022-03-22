package p1;

public class Car {

	int h;
	int w;

	// no-args or default constructor
	public Car() {
		h = 5;
		w = 7;
	}

//Parameterized constructor
	public Car(int a, int b) {
		this.h = a;
		this.w = b;
	}

	void display() {
		System.out.println("Height = " + h + ", width = " + w);
	}

	public static void main(String[] args) {

		Car c1 = new Car();
		c1.display();

		Car c2 = new Car();
		c2.display();

		Car c3 = new Car(50, 100);
		c3.display();
//
//		c1.h = 10;
//		c1.w = 20;
//
//		c1.display();
	}

}
