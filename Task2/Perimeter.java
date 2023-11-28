package Task2;

import java.util.Scanner;
   
public class Perimeter {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b,c;
		System.out.println("Value of a:");
		a=s.nextInt();
		System.out.println("Value of b :");
		b=s.nextInt();
		System.out.println("Value of c :");
		c=s.nextInt();
		int result=a+b+c;
		System.out.println("Perimter of Triangle :"+result);

	}

}
