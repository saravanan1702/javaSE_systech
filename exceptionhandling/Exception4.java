package exceptionhandling;

public class Exception4 {
	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println(a);// 0
			int x = 45;
			int z = x / a;
			System.out.println(z);
			//manually given exception
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("Wrong Value");
		}
	}
}
