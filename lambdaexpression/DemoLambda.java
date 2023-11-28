package lambdaexpression;

import java.util.Scanner;

interface modules {
	int setValue(int a);
}

public class DemoLambda {
	public static void main(String[] args) {
		modules ad2 = (int a) -> {
			return (a % 2);

		};
		int n, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Number :");
			a = sc.nextInt();
			int d = ad2.setValue(a);
			if (d == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}
		}
	}
}
