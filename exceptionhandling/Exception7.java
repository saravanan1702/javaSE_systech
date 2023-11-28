package exceptionhandling;

class Testing extends Exception {

	// parameter Constructor
	public Testing(String s) {
		System.out.println(s);
	}
}

public class Exception7 {
	public static void main(String[] args) {
		try {
			throw new Testing("Value sent");

		} catch (Testing t) {
			System.out.println("Error");
			System.out.println(t.getMessage());
		}
	}
}
