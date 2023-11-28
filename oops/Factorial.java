package oops;

import java.util.Scanner;

class fact1{
	void factfun(int x) {
		int fact=1;
		for(int i=1;i<=x;i++) {
			fact*=i;
		}
		System.out.println("Factorial Value is :"+fact);
	}
}
public class Factorial {
	public static void main(String[] args) {
//create object for fact
		fact1 f =new fact1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value :");
		int n=sc.nextInt();
		f.factfun(n);
	}
}
