package interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
class Product{
	String name;
	String vendor;
	int amount;
	int year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
}
public class FindingProductReportwithFunction {
	public static void main(String[] args) {
		List<Product> pro = new ArrayList<Product>();
		Product p1 = new Product();
		Product p2 = new Product();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product Name :");
		String pname=sc.next();
		System.out.println("Enter The Vendor Name :");
		String vname=sc.next();
		System.out.println("Enter The Price :");
		int price=sc.nextInt();
		System.out.println("Enter The Year :");
		int year1=sc.nextInt();
		p1.setName(pname);
		p1.setVendor(vname);
		p1.setAmount(price);
		p1.setYear(year1);
		System.out.println("Enter the Product Name :");
		String pname1=sc.next();
		System.out.println("Enter the Vendor Name :");
		String vname1=sc.next();
		System.out.println("Enter The Price :");
		int amount1=sc.nextInt();
		System.out.println("Enter The Year :");
		int year2=sc.nextInt();
		p2.setName(pname1);
		p2.setVendor(vname1);
		p2.setAmount(amount1);
		p2.setYear(year2);
		pro.add(p1);
		pro.add(p2);
		find(pro);
		findvendor(pro);
		
	}
	private static void find(List<Product>pro) {
		System.out.println("Above 20000 price Products");
		for(Product p:pro) {
			if(p.getAmount()>20000) {
				System.out.println(p.getName());
			}
		}
	}
	private static void findvendor(List<Product>pro) {
		System.out.println("2021 Year Products");
		for(Product p:pro) {
			if(p.getYear()==2021) {
				System.out.println(p.getName());
			}
		}
	}
}
