package oops.innerandlocalClass;
class Outer{
	class Inner{
		void display() {
			System.out.println("Hello,Java");
		}
	}
}
public class Base extends Outer {
	public static void main(String[] args) {
       Outer o=new Outer();
       //Outer.Innter i=new Outer.Inner();
       Outer.Inner i=o.new Inner();
       i.display();
	}
}
