package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class PrintngValuesUsingStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack value = new Stack();
		System.out.println("Enter the n :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Value :");
			int val = sc.nextInt();
			value.push(val);
		}
		String b="Systech";
		value.push(b);
		System.out.println(value);
		Float f=12.4f;
		value.push(f);
		System.out.println(value);
		//we can add multiple data types 
	}
}
