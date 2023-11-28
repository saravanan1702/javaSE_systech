package exceptionhandling;

public class Exception1 {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = a / 0;
			System.out.println(b);
		} catch (Exception e) {
			System.out.println("Error " + e);
		}
		System.out.println("Completed");
	}
}
