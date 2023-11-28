package conditional_nested_if;

import java.util.Scanner;

public class FindingOldestPerson {
	public static void main(String[] args) {
		int first, second, third;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Person Age :");
		first = s.nextInt();
		System.out.println("Enter Second Person Age :");
		second = s.nextInt();
		System.out.println("Enter Third Person Age :");
		third = s.nextInt();
		if(first>second && first>third) {
			System.out.println("First Person is Oldest Person");
		}
		else if(second>first && second>third) {
			System.out.println("Second Person is Oldest Person");
		}
		else if(third>first && third>second) {
			System.out.println("Third Person is Oldest Person");
		}else {
			System.out.println("All are Equal");
		}
	}
}
