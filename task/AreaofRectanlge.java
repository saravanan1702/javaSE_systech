package task;

import java.util.Scanner;

public class AreaofRectanlge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int breadth, length;
		System.out.println("Enter Length and Breadth :");
		length = sc.nextInt();
		breadth = sc.nextInt();
		int area = length * breadth;
		System.out.println("Area of Rectangle :" + area);

	}
}
