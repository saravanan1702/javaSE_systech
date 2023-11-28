package collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ReverseStringInArrayLIst {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<>();
		System.out.println("Enter N value :");
		int n = sc.nextInt();
		String name = null;
		for (int i = 0; i < n; i++) {
			name=sc.next();
			str.add(name);

		}
		for(int i=str.size()-1;i>=0;i--) {
			
			System.out.print(str.get(i)+" ");
		}
	}
}
