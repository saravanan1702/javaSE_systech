package stackandlilnkedlist;

import java.util.Scanner;
import java.util.Stack;

public class PrintingValuesUsingForLoopinStack {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		System.out.println("Enter The N value :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The The value :");
			int val = sc.nextInt();
			s.push(val);
		}
		System.out.println("Result is :" + s);
//		for (int i = 0; i < s.size(); i++) {
//			System.out.println(s.get(i));//getting values 
//		}
		//let's try in for each loop
		for(Integer x:s) {
			System.out.println(x);
		}
	}
}
