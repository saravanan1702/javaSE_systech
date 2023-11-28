package queueandSet;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintingQueueSize {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The  value :");
		int n = sc.nextInt();
		while (n != 1000) {
			q.add(n);
			System.out.println("Enter the value :");
			n = sc.nextInt();

		}
		System.out.println("Queue is :"+q);
		System.out.println("Size of Queue is :"+q.size());
	}
}
