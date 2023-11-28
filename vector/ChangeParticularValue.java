package vector;

import java.util.Scanner;
import java.util.Vector;
//hints get for vectors values one by one
// set for update values in vector
// add for adding element in vector
public class ChangeParticularValue {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number :");
		int d = sc.nextInt();
		int i = 1;
		while (i <= d) {
			System.out.println("Enter The Value :");
			int n = sc.nextInt();
			v.add(n);
			i++;
		}
		System.out.println("Vector is :" + v);
		System.out.println("Enter The Particular Value :");
		int x = sc.nextInt();
		System.out.println("Enter The update Value :");
		int y = sc.nextInt();
		// iterating loop
		for (int w = 0; w < v.size(); w++) {
			if (v.get(w) == x) {
				v.set(w, y);
			}
		}
		// after update
		System.out.println("After Update Vector :" + v);
	}
}
