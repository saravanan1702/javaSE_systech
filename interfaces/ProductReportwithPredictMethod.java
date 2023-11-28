package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ProductReportwithPredictMethod {
	public static void main(String[] args) {
		List<Product> pro = new ArrayList<Product>();
		Product p1 = new Product();
		Product p2 = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Product Name :");
		String pname = sc.next();
		System.out.println("Enter The Vendor Name :");
		String vname = sc.next();
		System.out.println("Enter the Price :");
		int amount = sc.nextInt();
		p1.setName(pname);
		p1.setVendor(vname);
		p1.setAmount(amount);
		System.out.println("Enter The Product Name :");
		String pname1 = sc.next();
		System.out.println("Enter the Vendor Name :");
		String vname1 = sc.next();
		System.out.println("Enter the Price :");
		int amount1 = sc.nextInt();
		p2.setName(pname1);
		p2.setVendor(vname1);
		p2.setAmount(amount1);
		pro.add(p1);
		pro.add(p2);
		find(pro, m -> m.getAmount() > 20000);
		find(pro, m -> m.getAmount() == 7000);

	}

	private static void find(List<Product> Pro, Predicate<Product> ProPredicate) {
		for (Product p : Pro) {
			if (ProPredicate.test(p)) {
				System.out.println(p.getName());
			}
		}
	}
}
