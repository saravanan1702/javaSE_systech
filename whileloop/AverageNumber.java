package whileloop;

import java.util.Scanner;

public class AverageNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 0, x, c = 0;
		float avg = 0f;
		System.out.println("Enter The N number :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) { // condition
			System.out.println("Enter The value :");
			x = sc.nextInt();
			sum += x;
			c = c + 1;// count
			i = i + 1;// increment the values
		}
		avg = sum / c;
		System.out.println("Average of n number is :" + avg);
	}
}
