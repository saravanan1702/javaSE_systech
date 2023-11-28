package oops.inheritance;

import java.util.Scanner;

interface Arithmatic5{
	default public void add(int x,int y) {
		int z;
		z=x+y;
		System.out.println("Addition is :"+z);
	}
}
interface Arithmatic6 extends Arithmatic5{
	default public void mul(int x,int y) {
		int z;
		z=x*y;
		System.out.println("Multiplication is :"+z);
	}
}
public class InterFacesDemo5  implements Arithmatic6 {
	public static void main(String[] args) {
		InterFacesDemo5  ie=new InterFacesDemo5 ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two Number :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		ie.add(num1, num2);
		ie.mul(num1, num2);
	}
}
