package exceptionhandling;

public class Exception11 {
	public static void main(String[] args) {
		String a = "This is Like Chipping";
		try {
			char c = a.charAt(25);
			System.out.println(c);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);//printing error type
			System.out.println("StringIndexBoundsException");//printing which error it would be
			char s = a.charAt(10);
			System.out.println(s);

		}
	}
}
