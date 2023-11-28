package task;

import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       int num1,num2;
       System.out.println("Enter The numbe 1:");
       num1=s.nextInt();
       System.out.println("Enter The Numbe 2:");
       num2=s.nextInt();
       System.out.println("Sum :"+(num1+num2));
       System.out.println("Divide :"+(num1/num2));
       System.out.println("Multiply :"+(num1*num2));
	}

}
