package pattern_program_forloop;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b, d, count = 0, t;
		System.out.println("Enter The Number :");
		a = sc.nextInt();
		d=0;
		b=a;
		t=a;
		while(t!=0) {
			a/=10;
			count=count+1;
			while(t!=0) {
				int temp=1;
				int r=t%10;
				for(int p=0;p<count;p++) {
					temp=temp*r;
				}
				d=d+temp;
				t=t/10;
				
			}
		}
		
		if(b==d) {
			System.out.println("Armstrong Number ");
		}else {
			System.out.println("Not Armstrong Number");
		}
	}
}
