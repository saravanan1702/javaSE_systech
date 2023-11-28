package do_while_loop;

import java.util.Scanner;

public class SumofCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 1, x;
		float avg;
		System.out.println("Enter The N Number :");
		n = sc.nextInt();
		int i = 1;
		do {
			x = i * i * i;
			sum *= x;
			i = i + 1;
		} while (i <= n);
		System.out.println("Sum of Squre is :" + sum);
		avg = sum / n;
		System.out.println("Average of cube is :" + avg);
	}
}
