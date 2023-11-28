package looping_Statements;

import java.util.Scanner;

public class StartandEnd_odd_or_even {
	public static void main(String[] args) {
    int s,e;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Starting Number :");
    s=sc.nextInt();
    System.out.println("Enter Ending Number :");
    e=sc.nextInt();
    for(int i=s;i<=e;i++) {
    	if(i%2==0) {
    		System.out.println(i+" Even Number ");
    	}
    	else {
    		System.out.println(i+" Odd Number");
    	}
    }
	}
}
