package exceptionhandling;

public class Exception3 {
	public static void main(String[] args) {
		try {
			int a = args.length;
			System.out.println(a);
			int x = 45;
			int z = x / a;// a of length is zero(0);
			System.out.println(z);
		} catch (Exception e) {
			System.out.println("Wrong Value ");
		}
	}
}
