package conditional_nested_if;

import java.util.Scanner;

public class Bitwise_or_and_operations {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y,z,d;
		System.out.println("Enter The First Value :");
		x=s.nextInt();
		System.out.println("Enter the Second Value :");
		y=s.nextInt();
		System.out.println("Enter any Option 1 or 2 or 3 or 4...");
		z=s.nextInt();
		if(z==1) {
			d=x&y;
			System.out.println("Bitwise-AND:"+d);
		}
		else if(z==2) {
			d=x|y;
			System.out.println("Bitwise -OR"+d);
			
		}
		else if(z==3) {
			d=x^y;
			System.out.println("Bitwise-XOR"+d);
			
		}else if (z==4) {
			d=~x;
			System.out.println("Bitwise-NOT :"+d);
		}
		else {
			System.out.println("Wrong");
		}
	}

}
