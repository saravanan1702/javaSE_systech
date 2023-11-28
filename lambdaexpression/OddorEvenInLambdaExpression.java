package lambdaexpression;

import java.util.Scanner;

interface OddorEven {
	int setValue(int a);
}

public class OddorEvenInLambdaExpression {
	public static void main(String[] args) {
		OddorEven ad2 = (int a) -> {
			return (a * a * a);
		};
		int n, a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println("Enter the Number :");
			a = sc.nextInt();
			int d = ad2.setValue(a);
			if (d % 2 == 0) {
				System.out.println("Even Number =" + d);
			} else {
				System.out.println("Odd Number =" + d);
			}
		}
	}
}
