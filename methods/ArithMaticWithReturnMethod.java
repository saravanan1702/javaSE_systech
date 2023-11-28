package methods;

import java.util.Scanner;

public class ArithMaticWithReturnMethod {
	static int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}

	static int mul(int a, int b) {
		return a * b;
	}

	static float div(float a, float b) {
		return a / b;
	}

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The two Number :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Addition of two number is :"+add(a,b));
        System.out.println("subtraction of two number is :"+sub(a,b));
        System.out.println("Multiplilcation of two number is :"+mul(a,b));
        System.out.println("Division of two number is :"+div(a,b));
        int x=200+add(a,b);//why we use return type we can reuse the values
        System.out.println("Total is :"+x);
	}
}
