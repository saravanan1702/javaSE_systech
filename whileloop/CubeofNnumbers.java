package whileloop;

import java.util.Scanner;

public class CubeofNnumbers {
	public static void main(String[] args) {
		int n, sum = 1, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N number :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			x = i * i * i;
			sum *= x;
			i += 1;
		}
		System.out.println("Sum of Squre is :" + sum);
	}
}
