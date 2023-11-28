package oops.innerandlocalClass;

abstract class DataClass {
	abstract void display();

	abstract void printing();

	// In Abstract class either non abstract method or Abstract method can have
	public void entry() {
		System.out.println("Values ");
	}

}

public class AbclassExample extends DataClass {
	public static void main(String[] args) {
		AbclassExample e = new AbclassExample();
		e.display();
		e.printing();
		e.entry();

	}

	@Override
	void display() {
		System.out.println("Display Function ");
	}

	@Override
	void printing() {
		System.out.println("Printing Function");
	}
}
