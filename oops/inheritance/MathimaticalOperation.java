package oops.inheritance;

import java.util.Scanner;

class Operation1{
	int m=3;
	int s=5;
	int r;
    //constructor
	public Operation1(int x,int y){
		m=x;
		s=y;
	}
	void add() {
		r=m+s;
		System.out.println("Addition Value is :"+r);
	}
	void sub() {
		r=m-s;
		System.out.println("Subtraction value is:"+r);
	}
	
}
class Operation2 extends Operation1{
	//if base class have any constructor that must be override in sub class
	public Operation2(int x, int y) {
		super(x,y);
	}
	void react() {
		
		//getting instance of super class variables
		r=super.m*super.s;
		System.out.println("Rectable value is :"+r);
		
	}
	boolean isSqure() {
		if(super.m==super.s) {
		 return true;
		}
		else {
			return false;
		}
	
	}
	void squre() {
		r=super.m+super.m;
		System.out.println("Squre Value is :"+r);
	}
	
}
public class MathimaticalOperation  extends Operation2{
	//must be override base class constructor
	public MathimaticalOperation(int x,int y) {
		super(x, y);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		MathimaticalOperation m=new MathimaticalOperation(num1,num2);
		m.add();
		m.isSqure();
		m.sub();
		m.react();
		
	}
}
