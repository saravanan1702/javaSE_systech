package looping_Statements;

import java.util.Scanner;

public class PrintingAddandEvenNumbers {
	public static void main(String[] args) {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter N Numbers :");
      n=sc.nextInt();
      for(int i=1;i<=n;i++) {
    	  if(i%2==0) {
    		  System.out.println(i+" Even Number");
    	  }
    	  else {
    		  System.out.println(i+" Odd Number");
    	  }
      }
	}
}
