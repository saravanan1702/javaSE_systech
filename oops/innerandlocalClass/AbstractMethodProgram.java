package oops.innerandlocalClass;

abstract class Mathfun {
	abstract void display();
}

public class AbstractMethodProgram {
	public static void main(String[] args) {
		
		//if we are just defined inside the method if we create inside method that mean annoymous class that class haven't name
		Mathfun s = new Mathfun() {
			void display() {
				System.out.println("Hello Welcome");
			}
		};
		s.display();
	}
}
