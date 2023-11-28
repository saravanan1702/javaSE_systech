package conditional_nested_if;

import java.util.Scanner;

public class Grade_of_Student {
	public static void main(String[] args) {
		String name;
		int mark;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		name = s.next();
		System.out.println("Enter Your Mark :");
		mark = s.nextInt();
		if (mark >= 90 && mark <= 100) {
			System.out.print("Your Name is  " + name + "  Your  Grade is I");
		} else if (mark >= 50 && mark <= 80) {
			System.out.println("Your name is " + name + " Your Grade is II");
		} else if (mark >= 35 && mark <= 50) {
			System.out.println("Your Name is " + name + " Your Grade is III");
		} else if (mark < 25) {
			System.out.println("Your Name is " + name + " Your Fail");
		} else {
			System.out.println("Wrong Mark");
		}

	}
}
