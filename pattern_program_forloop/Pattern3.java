package pattern_program_forloop;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n;
       System.out.println("Enter The n value :");
       n=sc.nextInt();
       for(int i=1;i<=n;i++) {
    	   for(int j=1;j<=i;j++) {
    		   System.out.print("*");
    	   }
    	   System.out.print("\n");
       }
	}
}
