package queueandSet;

import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Vector;

public class PriortyQueueCreating {
	public static void main(String[] args) {
		PriorityQueue<Integer> r = new PriorityQueue<Integer>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value :");
		int n = sc.nextInt();
		while (n != 100) {
			r.add(n);
			System.out.println("Enter the value :");
			n = sc.nextInt();
		}
		System.out.println("Queue is :"+r);
		System.out.println("Top value is :"+r.peek());
		System.out.println("Delet Value in Queue :"+r.remove());
		System.out.println("Updated Queue is :"+r);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("Delete Value is :"+r.remove());
		System.out.println("Updated Queue is :"+r);
	}
}
