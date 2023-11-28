package looptask;

import java.util.Scanner;

public class FactorialOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        int fact=1;//anything multiple zero would be zero
        int sum=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	fact*=i;
        	sum+=fact;
        }
        System.out.println("factorial of Number is :"+fact);
        System.out.println("Sum of Factorial    is :"+sum);
	}

}
