package looping_Statements;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
     int n,s=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter N Number :");
     n=sc.nextInt();
     if(n>1) {
    	 for(int i=2;i<n;i++) {
    		 if(n%i==0) {
    			 s=1;
    			 break;
    		 }
    	 }
     }
     if(s==1) {
    	 System.out.println("It's not prime Number ");
     }
     else {
    	 System.out.println("It is Prime Number");
     }
	}
}
