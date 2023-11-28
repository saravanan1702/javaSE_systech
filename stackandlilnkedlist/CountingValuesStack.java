package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class CountingValuesStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The data :");
			int a = sc.nextInt();
			s.push(a);
		}
		System.out.println("Stack is :" + s);
		System.out.println("Enter The Finding Value :");
		int index = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (s.get(i) == index) {
				count++;
			}
		}
		System.out.println("the Count is :" + count);
	}
}
