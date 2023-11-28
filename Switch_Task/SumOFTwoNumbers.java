package Switch_Task;

import java.util.Scanner;

public class SumOFTwoNumbers {
	public static void main(String[] args) {
		int a, b, sum;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The First Value :");
		a = s.nextInt();
		System.out.println("Enter The Second Value :");
		b = s.nextInt();
		sum = a + b;
		if (sum % 2 == 0) {
			System.out.println("Even Number");
		} else {
			System.out.println("ODD Numbers");
		}
	}
}
