package whileloop;

import java.util.Scanner;

public class ReverseOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter N number :");
		n = sc.nextInt();
		int i = n;//5 4 3
		while (i > 0) { //5>0  4>0 3>0
			System.out.println(i); //5 4 3 ...
			i = i - 1;//5-1=4  4-1=3 ..until it gets zero

		}
	}
}
