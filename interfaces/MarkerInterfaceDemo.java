package interfaces;

interface Ticket {

}

class Person implements Ticket {

}

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Person p = new Person();
		// checking whether interface belongs to person or not
		if (p instanceof Ticket) {
			System.out.println("This Object Login Successfully");
		} else {
			System.out.println("Object Not Login..");
		}
	}
}
