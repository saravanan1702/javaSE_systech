package task;

import java.util.Scanner;

public class Perimeter_of_Rectangle {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float w,l;
		System.out.println("Enter The Length :");
		l=s.nextFloat();
		System.out.println("Enter The Width :");
		w=s.nextFloat();
		float c =2*(l*w);
		System.out.println("Perimeter of Rectangle is :"+c);
		
		
	}


}
