package conditional_nested_if;

import java.util.Scanner;

public class BiggestOf3Values {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.println("Enter the First Values :");
		a = s.nextInt();
		System.out.println("Enter the Second Values :");
		b = s.nextInt();
		System.out.println("Enter The third Values :");
		c = s.nextInt();
		if ((a > b) && (a > c)) {
			System.out.println("A is Big Number");

		}else if(b>a && b>c) {
			System.out.println("B is  Big ");
		}
		else if(c>a && c>b) {
			System.out.println("C is Big");
		}
		else {
			System.out.println("All are Equal ");
		}
	}
}
