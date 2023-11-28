package do_while_task;

import java.util.Scanner;

public class Sumof5AvgNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x, sum = 0;
		float avg=0f;
		System.out.println("Enter The n numbers :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			System.out.println("Enter The Number :");
			x=sc.nextInt();
			sum+=x;
			i=i+1;
		}
		System.out.println("sum of 5 numbers is :"+sum);
		avg=sum/n;
		System.out.println("Sum of 5 Number Average is :"+avg);
	
	}
}
