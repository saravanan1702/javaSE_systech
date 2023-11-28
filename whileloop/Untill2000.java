package whileloop;

import java.util.Scanner;

public class Untill2000 {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The value :");
		a=sc.nextInt();
		while(a!=2000) {
			System.out.println("The Value is :"+a);
			System.out.println("Enter the value :");
			a=sc.nextInt();
		}
	}
}
