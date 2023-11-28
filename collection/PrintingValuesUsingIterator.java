package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintingValuesUsingIterator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the N :");
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter The Value :");
			int t = sc.nextInt();
			list.add(t);
		}
		System.out.println("ArraList :" + list);
		Iterator itr = list.iterator();
		System.out.println("Printing Values :");
//		while (itr.hasNext()) {
//			itr.forEachRemaining((value) -> System.out.println(value + ","));
//		}
		while(itr.hasNext()) {
			int x=(int)itr.next();//coverting object into primitive data types
;			System.out.println(x);
		}

	}
}
