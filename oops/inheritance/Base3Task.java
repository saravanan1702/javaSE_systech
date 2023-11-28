package oops.inheritance;

import java.util.Scanner;

class Base3{
	int  add(int x,int y) {
		int z;
		z=x+y;
		return z;
	}
}
public class Base3Task extends Base3{
	public static void main(String[] args) {
    Base3Task base=new Base3Task();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the First Value :");
    int a=sc.nextInt();
    System.out.println("Enter the Second Value :");
    int b=sc.nextInt();
    int c=base.add(a, b);
    System.out.println("Adding Two values is :"+c);
    
	}
}
