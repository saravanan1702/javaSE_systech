package task;

import java.util.Scanner;

public class Quantity_Product_price {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float product_price;
		int qty;
		System.out.println("Ente the Product Price:");
		product_price=s.nextFloat();
		System.out.println("Enter The Quantity :");
		qty=s.nextInt();
		float amount=product_price*qty;
		System.out.println("total amount :"+amount);
		
	}
}
