package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class RemoveallValues {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente The n value :");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter The value :");
			int val=sc.nextInt();
			stack.push(val);
		}
		System.out.println("stack is :"+stack);
		stack.removeAll(stack);
		System.out.println("Stack is :"+stack);
	}
}
