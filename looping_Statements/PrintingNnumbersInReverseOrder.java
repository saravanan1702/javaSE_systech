package looping_Statements;

import java.util.Scanner;

public class PrintingNnumbersInReverseOrder {
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n;
     System.out.println("Enter N numbers :");
     n=s.nextInt();
     for(int  i=n;i>0;i--) {
    	 System.out.println(i);
     }
	}
}
