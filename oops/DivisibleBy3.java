package oops;

import java.util.Scanner;
class Div
{
//	int y;
	void divfun(int x) {
//		y=x;
		
		if(x%3==0) {
			System.out.println("Divisible by 3");
		}else {
			System.out.println("Not Divisible by 3");
		}
	}
}
public class DivisibleBy3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The value :");
		int a=sc.nextInt();
		Div d=new Div();
		d.divfun(a);
		
	}
}
