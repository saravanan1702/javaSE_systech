package exceptionhandling;

public class NestedExceptionMethod {
	static void test(int a) {
		try {
			if (a == 1) {
				a *= a;
				System.out.println("Square :" + a);
			}
			if (a == 2) {
				int c[] = { 1000 };
				c[100] = 100;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index :" + e);
		}

	}
	public static void main(String[] args) {
		try {
			int a=args.length;
			int b=10/a;
			System.out.println("a="+a);
			test(a);
		}catch(ArithmeticException e) {
			System.out.println("Divide by zero :"+e);
		}
	}
}
