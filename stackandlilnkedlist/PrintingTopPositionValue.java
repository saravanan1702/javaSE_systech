package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class PrintingTopPositionValue {
	public static void main(String[] args) {
		Stack s = new Stack();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The value :");
			int a = sc.nextInt();
			s.push(a);
		}
		System.out.println("Top Value is :" + s.peek());// to see top position in Stack
	}
}
