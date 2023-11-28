package queueandSet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintingValues {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N value :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the value :");
			int val = sc.nextInt();
			q.add(val);
		}
		System.out.println("Queue is :"+q);
	}
}
