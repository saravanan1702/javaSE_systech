package polymorphism;

class Operation1 {
	static int calc(int x, int y) {
		int c = x + y;
		return c;
	}

	public int calc(int x, int y, int z) {
		int t = x + y + z;
		return t;
	}
}

public class Overload2 {
	public static void main(String[] args) {
		Operation1 op = new Operation1();
		int total = op.calc(1, 2, 3);
		System.out.println("Result is :" + total);//6
		int total2 = op.calc(total, 5);// 11
		System.out.println("Result is :" + total2);
	}
}
