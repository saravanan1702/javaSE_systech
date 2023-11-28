package Conditional_statement;

import java.util.Scanner;

public class Cost_of_Quantity {
	public static void main(String[] args) {
		int quantity,total;
		double discount,pay;
		int price=150;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Number of Quantity :");
		quantity=s.nextInt();
		total=price*quantity;
		if(total>1000) {
			discount=0.1*total;
			pay=total-discount;
			System.out.println("Total Pay  Amount is :"+pay);
		}
		else {
			System.out.println("total pay amount is :"+total);
		}
	}
}
