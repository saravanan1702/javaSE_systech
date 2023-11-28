package Task2;

import java.util.Scanner;

public class Celconverstaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the Value in Celsius :");
		a=s.nextInt();
		b=(9/5)*a+32;//farenheit formula
		System.out.println("Farenheit values is :"+b);

	}

}
