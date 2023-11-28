package exceptionhandling;

public class Exception6 {
	public static void agecal(int age) {
		if(age>30) {
			throw new ArithmeticException ("this person not eligble");
		}else {
			System.out.println("Eligible");
		}
	}
public static void main(String[] args) {
	agecal(25);
}
}
