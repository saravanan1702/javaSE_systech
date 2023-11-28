package collection;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CountingParticularValuesiNEnumuration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		Enumeration data;
		System.out.println("Enter The N value :");
		int n = sc.nextInt();
		int h = 0;
		int i = 1;
		while (i <= n) {
			Integer integer = sc.nextInt();
			v.add(integer);
			i++;
		}
		data = v.elements();// storing all vector element into enumuration
		System.out.println("Enter The Particular Value :");
		Integer x = sc.nextInt();
		while (data.hasMoreElements()) {
			if (data.nextElement() == x) {
				h += 1;
			}
		}
		System.out.println("Count is : " + h);
	}
}
