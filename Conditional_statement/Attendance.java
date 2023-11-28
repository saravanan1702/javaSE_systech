package Conditional_statement;

import java.util.Scanner;

public class Attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int classes ,attend;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Total Number of Classes :");
		classes=s.nextInt();
		System.out.println("Enter The Attended Classes :");
		attend=s.nextInt();
		double attendance=(attend*100)/classes;
		if((attendance>70.0)) {
			System.out.println("you Are Allowed the Exam");
		}else {
			System.out.println("You Are Not Allowed the Exam");
		}

	}

}
