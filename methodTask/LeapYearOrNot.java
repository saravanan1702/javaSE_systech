package methodTask;

import java.util.Scanner;

public class LeapYearOrNot {
	static boolean year(int y) {
		if (y % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Year :");
		int year=sc.nextInt();
		System.out.println(year+" is a leap year ? "+year(year));
	}
}
