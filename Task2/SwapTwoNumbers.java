package Task2;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,d;
		System.out.println("Enter The First Value :");
		a=s.nextInt();
		System.out.println("Enter Second Value :");
		b=s.nextInt();
		d=a;
		a=b;
		b=d;
		System.out.println("Swaping Result is :");
		System.out.println("A is "+a+" B is "+b);

	}

}
