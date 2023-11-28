package oops.inheritance;
class Parent1{
	int x=100;
	int y=200;
}

public class HierarchicalInheritance  extends Parent1{
	public static void main(String[] args) {
		HierarchicalInheritance h=new HierarchicalInheritance();
		System.out.println("Value of x is :"+h.x);
	}
}
