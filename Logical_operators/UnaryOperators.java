package Logical_operators;

import java.util.Scanner;

public class UnaryOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         int x,y;
         System.out.println("Enter The Value of X:");
         x=s.nextInt();
         y=-x;
         System.out.println(y);
         y=+x;
         System.out.println(y);
         y=++x;
         System.out.println(y);
         y=--x;
         System.out.println(y);
         
	}

}
