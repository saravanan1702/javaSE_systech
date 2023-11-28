package Conditional_statement;

import java.util.Scanner;

public class Printing_bonus_amoung {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int salary,exp;
	double bonus=0;
	System.out.println("Enter Your Salary");
	salary=s.nextInt();
	System.out.println("Enter Your Experience ");
	exp=s.nextInt();
	if(exp>6) {
		bonus=0.1*salary;
		System.out.print("Your Bonus is :");
		System.out.println(bonus);
	}
	else {
		System.out.println("No Bonus");
	}
}
}
