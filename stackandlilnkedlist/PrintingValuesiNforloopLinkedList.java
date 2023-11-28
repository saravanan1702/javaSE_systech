package stackandlilnkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class PrintingValuesiNforloopLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N :");
		int n = sc.nextInt();
		int i = 0;
		while (i < n) {
			System.out.println("Enter The Value :");
			int val = sc.nextInt();
			list.add(val);
			i++;
		}
		System.out.println("Linked list:");
		for(int j=0;j<list.size();j++) {
			System.out.println(list.get(j)+" ");
			//get valuesa only by one
		}

	}
}
