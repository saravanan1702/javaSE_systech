package pattern_program_forloop;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     int n;
     System.out.println("Enter The N value :");
     n=sc.nextInt();
     for(int i=1;i<=n;i++) {
    	 System.out.print("*");
     }
	}
}
