package pattern_program_forloop;

import java.util.Scanner;

public class StarPattern10 {
	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n;
     System.out.println("Enter N Value :");
     n=sc.nextInt();
     for(int i=n;i>0;i--) {
    	 for(int j=i;j<=n;j++) {
    		 System.out.print(" ");
    	 }
    	 for(int k=1;k<=i;k++) {
    		 System.out.print("* ");
    	 }
    	 System.out.println();
     }
	}
}
