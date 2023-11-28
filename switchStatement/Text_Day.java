package switchStatement;

import java.util.Scanner;

public class Text_Day {
	public static void main(String[] args) {
		int opt;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Any One Option 1 or 2 or 3 or 4....");
		opt = s.nextInt();
		switch (opt) {
		case 1: {
			System.out.println("Hai Welcome");
		}
		case 2: {
			System.out.println("Good Morning to All");
			break;
		}
		case 3: {
			System.out.println("Thank You");
		}
		case 4: {
			System.out.println("Good Night");
			break;
		}
		default: {
			System.out.println("Error");
			break;
		}
		}

	}
}
