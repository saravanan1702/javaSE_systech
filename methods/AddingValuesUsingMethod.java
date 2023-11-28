package methods;

import java.util.Scanner;

public class AddingValuesUsingMethod {
	static void add(int x, int y) {
		int z = x + y;
		System.out.println("Sum of two number  is :" + z);
	}

	public static void main(String[] args) {
		//call by value =>we pass value to the method
		Scanner sc=new Scanner(System.in);
		//getting input from user side by using scanner class
		System.out.println("Enter The number 1 and number 2 :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
       add(num1,num2);
       add(12,3);
       add(10,30);
	}
}
