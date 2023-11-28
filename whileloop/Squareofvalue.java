package whileloop;

import java.util.Scanner;

public class Squareofvalue {
	public static void main(String[] args) {
		int n, sum = 0, x;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The N number :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			x = i * i;
			sum = sum + x;
			i = i + 1;
		}
		System.out.println("Sum of Square is :"+sum);
	}
}
