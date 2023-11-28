package collection;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class FindingValuesUsingEnumuration {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		Enumeration e;
		System.out.println("Enter The N :");
		int d = sc.nextInt();
		int i = 1;// initialize
		while (i <= d) {// condition
			System.out.println("Enter The String value :");
			String str = sc.next();
			v.add(str);
			i++;// increment operator
		}
		e = v.elements();// storing vectors values in enumuration
		System.out.println("Enter The Particular Word :");
		String s = sc.next();
		while (e.hasMoreElements()) {
			if (s.equals(e.nextElement())) {
				System.err.println("Available");
			}

		}

	}
}
