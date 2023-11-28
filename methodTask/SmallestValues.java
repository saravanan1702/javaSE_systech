package methodTask;

public class SmallestValues {
	static void small(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println("Smallest Value is :" + a);
		} else if (b < a && b < c) {
			System.out.println("Smallest Value is :" + b);
		} else {
			System.out.println("Smallest Value is :" + c);
		}
	}

	public static void main(String[] args) {
		small(25, 37, 29);

	}
}
