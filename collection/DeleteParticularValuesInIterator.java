package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class DeleteParticularValuesInIterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int number = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < number; i++) {
			System.out.println("Enter The value :");
			int t = sc.nextInt();
			al.add(t);

		}
		System.out.println(al);
		Iterator ie = al.iterator();
		System.out.println("Enter The Particular Value :");
		int x = sc.nextInt();
		while (ie.hasNext()) {
			int i = (int) ie.next();// converting object into primitive Data Types
			if (i == x) {
				ie.remove();
			}

		}
		System.out.println("After Removing Particular element from arrayLIst"+al);
	}
}
