package oops;

import java.util.Scanner;
class AreaofRectangle{
	int m,s,r;//local variables within the class
	public void area(int x,int y) {
		m=x;
		s=y;
		r=m*s;
		System.out.println("Area of Rectangle :"+r);
	}
}
public class AreaOFRect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The L value :");
		int l=sc.nextInt();
		System.out.println("Enter The B value :");
		int b=sc.nextInt();
		AreaofRectangle s=new AreaofRectangle();//object creation
		s.area(l, b);//values passing with object reference
		//annoymous object
		new AreaofRectangle().area(l, b);
		
	}
}
