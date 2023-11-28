package whileloop;

import java.util.Scanner;

public class AverageOfCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum = 1, x;
		float avg;
		System.out.println("Enter The N number:");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			x = i * i * i ;
			sum = sum * x;
			i = i + 1;
		}
		avg = sum / n;
		System.out.println("Average of Cube is :" + avg);

	}
}
