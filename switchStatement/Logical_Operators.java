package switchStatement;

import java.util.Scanner;

public class Logical_Operators {
	public static void main(String[] args) {
		int a,b,opt;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The First Value :");
		a=s.nextInt();
		System.out.println("Enter the Second Value :");
		b=s.nextInt();
		System.out.println("Enter The any option :1 or 2 or 3 or 4");
		opt=s.nextInt();
		switch(opt) {
		case 1:
			System.out.println("AND Operations");
			if(a>0 && b>=0) {
				System.out.println("Both Valus Are Possitive ");
			}else {
				System.out.println("Negative Values ");
			}
			break;
		case 2:
			System.out.println("OR Operation");
			if(a>0 || b>0) {
				System.out.println("Both values are +ve");
			}else{
				System.out.println("Negative Values");
			}
			break;
			
		case 3:
			System.out.println("NOT Operation");
			if(!(a==0)) {
				System.out.println("A is Zero");
			}else {
				System.out.println("Not Zero");
			}
			break;
		default:
			System.out.println("Error");
			break;
			
		}
		
	}
}
