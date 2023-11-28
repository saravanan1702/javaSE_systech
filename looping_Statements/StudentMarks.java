package looping_Statements;

import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t, e, m, s, ss, sum = 0;
		float avg;
		System.out.println("Enter N numbers :");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Enter Tamil Marks :");
			t = sc.nextInt();
			System.out.print("Enter English Mark ");
			e = sc.nextInt();
			System.out.print("Enter Maths Mark :");
			m = sc.nextInt();
			System.out.print("Enter Science Mark :");
			s = sc.nextInt();
			System.out.print("Enter Social Science mark :");
			ss = sc.nextInt();
			sum = t + e + m + s + ss;
			avg = sum / 5;
			if (avg > 70) {
				System.out.println("First Grade ");
			} else if (avg > 40 && avg <= 70) {
				System.out.println("Second Grade");
			} else {
				System.out.println("Fail");
			}
			System.out.println("--------------------------------");

		}
	}
}
