package oops.innerandlocalClass;
class Outer2{
	void dis() {
		System.out.println("Hello!");
	}
	class Inner2{
		void dis2() {
			System.out.println("Vanakam!");
		}
	}
}
public class InnnereandOuter {
	public static void main(String[] args) {
		Outer2 o=new Outer2();
		Outer2.Inner2 i=o.new Inner2();
		o.dis();//outside class
		i.dis2();//inside class

	}
}
