package oops;

import java.util.Scanner;

class Arith2{
	int m=30;
	int s=50;
	int r;
	Arith2(){
		System.out.println("Addition value is :");
	}
	void add(int x,int y) {
		r=m+s;//we assign instance of class variable not assiging argument variable
		System.out.println(r);
		//passing argument variable
		r=x+y;
		System.out.println(r);
	}
}
public class ArithmaticWithConstructor {
	public static void main(String[] args) {
      Arith2 a=new Arith2();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The first value :");
      int num1=sc.nextInt();
      System.out.println("Enter The Second value :");
      int num2=sc.nextInt();
      a.add(num1, num2);
	}
}
