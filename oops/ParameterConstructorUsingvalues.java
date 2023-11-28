package oops;

import java.util.Scanner;

class Pconst{
	int m=30;
	int n=50;
	int p;
	Pconst(int x,int y){
		//Instance value will be override
		m=x;//10 
		n=y;//5
		System.out.println("Addition Value is :");
	}
	void add() {
		p=m+n;
		System.out.println(p);
		
	}
}
public class ParameterConstructorUsingvalues {
	public static void main(String[] args) {
      Pconst p=new Pconst(10,5);
      p.add();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The value 1 :");
      int n1=sc.nextInt();
      System.out.println("Enter The value 2 :");
      int n2=sc.nextInt();
      Pconst p1=new Pconst(n1,n2);
      p1.add();
	}
}
