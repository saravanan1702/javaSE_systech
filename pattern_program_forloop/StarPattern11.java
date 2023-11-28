package pattern_program_forloop;

import java.util.Scanner;

public class StarPattern11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter The N value :");
		n = sc.nextInt();
        int a=1;
        for(int i=1;i<=n;i++) {
        	for(int j=i;j<=n;j++) {
        		System.out.print(" ");
        	}
        	for(int k=1;k<=a;k++) {
        		System.out.print("*");
        	}
        	a=a+2;
        	System.out.println();
        }
	}
}
