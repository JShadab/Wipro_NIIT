
public class Test2 {

	int sum(float a, int b) {
		int x = (int) (a + b);
		return x;
	}
	
	int sum(int a, float b) {
		int x = (int) (a + b);
		return x;
	}

	int sum(int a, int b, int c) {
		int x = a + b + c;
		return x;
	}
	float sum(int a, int b, int c) {
		int x = a + b + c;
		return x;
	}

}
