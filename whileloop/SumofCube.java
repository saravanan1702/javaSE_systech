package whileloop;

import java.util.Scanner;

public class SumofCube {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,sum=1,x;
		System.out.println("Enter The N value :");
		n=sc.nextInt();
		int i=1;
		while(i<=n) {
			x=i*i*i;
			sum*=x;
			i=i+1;
			
		}
		float avg=sum/n;
		System.out.println("Sum of Squre is :"+sum);
		System.out.println("Average :"+avg);
		
	}
}
