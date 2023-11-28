package looping_Statements;

import java.util.Scanner;

public class LeapYearPrinting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start, end;
		System.out.println("Enter Starting year :");
		start = sc.nextInt();
		System.out.println("Enter Ending Year   :");
		end = sc.nextInt();
		for (int i = start; i <= end; i++) {
             if(i%4==0) {
            	System.out.println(i+" is leap Year"); 
             }else {
            	 System.out.println(i+" is not a Leap Year");
             }
		}
	}
}
