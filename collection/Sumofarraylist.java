package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Sumofarraylist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, t, sum = 0;
		ArrayList<Integer> li = new ArrayList<>();
		System.out.println("Enter The N :");
		n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			li.add(t);

		}
		for(int i=0;i<n;i++) {
			sum+=li.get(i);
		}
		System.out.println("Sum of All the element in this ArrayList is :"+sum);

	}
}
