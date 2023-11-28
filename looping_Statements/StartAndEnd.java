package looping_Statements;

import java.util.Scanner;

public class StartAndEnd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end;
		System.out.println("Enter Starting Value :");
		start = sc.nextInt();
		System.out.println("Enter Ending Value :");
		end = sc.nextInt();
		for(int i=start;i<=end;i++) {
			System.out.println(i);
		}
	}
}
