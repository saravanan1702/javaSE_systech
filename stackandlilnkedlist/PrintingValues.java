package stackandlilnkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class PrintingValues {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println("Enter The value :");
			int val = sc.nextInt();
			list.add(val);
			i++;
		}
		System.out.println("Linked List is :" + list);
		//printing values using iterator class
		Iterator<Integer>itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	

	}
}
