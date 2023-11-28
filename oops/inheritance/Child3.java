package oops.inheritance;

import java.util.Scanner;

public class Child3 extends Base10 {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter The Number 1 and Number 2 :");
    int number1=sc.nextInt();
    int number2=sc.nextInt();
    Child3 c=new Child3();
    //number 1=100
    //number 2=50;
    //add ==> 100+50
    //sub==>100-50
    c.add(number1, number2);//150
    c.sub(number1, number2);//50
	}
}
