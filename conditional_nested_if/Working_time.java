package conditional_nested_if;

import java.util.Scanner;

public class Working_time {
	public static void main(String[] args) {
		String name, degree;
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your Name :");
		name = s.next();
		System.out.println("Enter Your Qualification :");
		degree = s.next();
		System.out.println("Enter Your Age :");
		age = s.nextInt();
		if (degree.equals("ug")) {
			if (age >= 20 && age <= 30) {
				System.out.println("Hi " + name + " Your Working time 9 a.m to 7 p.m");
			}
		} else if (degree.equals("pg")) {
			if (age >= 20 && age <= 30) {
				System.out.println("Hi " + name + " Your Working time 8 p.m to 8 a.m");
			}
		} else {
			System.out.println("Hi " + name + " not Eligible....");
		}
	}
}
