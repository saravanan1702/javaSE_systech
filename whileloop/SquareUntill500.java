package whileloop;

import java.util.Scanner;

public class SquareUntill500 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,x;
		System.out.println("Enter The Value :");
		a=sc.nextInt();
		while(a!=500) {
			x=a*a;
			System.out.println("The Square value is :"+x);
			System.out.println("Enter The value :");
			a=sc.nextInt();
		}
	}
}
