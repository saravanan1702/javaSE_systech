package conditional_nested_if;

import java.util.Scanner;

public class InterviewSelect {
	public static void main(String[] args) {
		String name;
		int mark, percent;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		name = s.next();
		System.out.println("Enter Your Mark :");
		mark = s.nextInt();
		System.out.println("Enter Your Percentage :");
		percent = s.nextInt();
		if (percent > 75) {
			if (mark > 80) {
				System.out.println("Hi " + name + " you Are Selected");
			} else {
				System.out.println("Hi " + name + " you are not Selected");
			}
		} else {
			System.out.println("Hi " + name + " You are Not Selected");
		}
	}
}
