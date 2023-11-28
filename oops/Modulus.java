package oops;

import java.util.Scanner;

class Mod{
	int p,q,r;
	public void func(int x,int y) {
		p=x;
		q=y;
		r=p%q;
		System.out.println("Modulus is :"+r);
	}
}
public class Modulus {
	public static void main(String[] args) {
      Mod m1=new Mod(),m2=new Mod(),m3=new Mod();//multiple object create in single line
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The 1st Value :");
      int a=sc.nextInt();
      System.out.println("Enter The 2nd Value :");
      int b=sc.nextInt();
      m1.func(a, b);
      m2.func(100, 200);
      System.out.println("Enter 1st value :");
      a=sc.nextInt();
      System.out.println("Enter 2nd value :");
      b=sc.nextInt();
      m3.func(a,b);
 
      
	}
}
