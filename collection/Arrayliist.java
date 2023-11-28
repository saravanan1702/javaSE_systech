package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Arrayliist {
	public static void main(String[] args) {
		int  t;
		ArrayList<Integer> data = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Add element "+i+" :");
			t = sc.nextInt();
			data.add(t);
		}
		System.out.println("ArrayList :"+data);
	}
}
