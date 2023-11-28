package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class RemoveValueInStack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<>();
		System.out.println("Enter the n value :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The value :");
			int val = sc.nextInt();
			stack.push(val);
		}
		System.out.println("Now Stack is :" + stack);
		System.out.println("Enter The Deleting Value :");
		int t = sc.nextInt();
		for (int i = 0; i < stack.size(); i++) {
			if (stack.get(i) == t) {
				stack.remove(i);// remove this element
			}
		}
		System.out.println("Stack is :"+stack);

	}
}
