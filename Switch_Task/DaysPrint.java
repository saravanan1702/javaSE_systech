package Switch_Task;

import java.util.Scanner;

public class DaysPrint {
	public static void main(String[] args) {
		int opt;
		String days;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 7");
		opt = s.nextInt();
		switch (opt) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Thusday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid Option");
			break;

		}
	}
}
