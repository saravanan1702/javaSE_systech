package polymorphism;

class Operation {
	static int calc(int x, int y) {
		int c = x + y;
		return c;
	}

	public float calc(float x, float y) {
		float c = x + y;

		return c;
	}
}

public class OverLoad1 {
	public static void main(String[] args) {
		Operation op = new Operation();
		System.out.println("Result is :" + op.calc(12.3f, 20.2f));
		int t = op.calc(12, 10);
		System.out.println("Result is :" + t);
	}
}
