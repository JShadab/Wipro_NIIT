
public class Cat {

	private int age;

	// getter
	public int getAge() {
		return age;
	}

	// setter
	public void setAge(int x) {

		if (x <= 0) {

			System.out.println("Are u crazy..");
			return;
		}

		this.age = x;
	}

}
