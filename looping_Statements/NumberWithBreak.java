package looping_Statements;

import java.util.Scanner;

public class NumberWithBreak {
	public static void main(String[] args) {
     int start,end,k;
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Starting Value :");
     start=sc.nextInt();
     System.out.println("Enter Ending Value :");
     end=sc.nextInt();
     System.out.println("Enter Searching Values :");
     k=sc.nextInt();
     for(int i=start;i<=end;i++) {
    	 if(i==k) {
    		 break;
    	 }
    	 System.out.println(i);
     }
	}
}
