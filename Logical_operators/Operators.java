package Logical_operators;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		int x,y,z;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Values of x:");
		x=s.nextInt();
		System.out.println("Enter the values of Y:");
		y=s.nextInt();
		System.out.println("Enter the values of z:");
		z=s.nextInt();
		System.out.println((x<y)&&(x<z));
		System.out.println((x!=y ||(x==z)));
		System.out.println(!(x<y));
	
				
				

	}

}
