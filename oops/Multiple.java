package oops;

class BaseTask {
	void display() {
		System.out.println("Java Programming");
	}
}

class BaseTask2 extends BaseTask {
	void display2() {
		System.out.println("Systech Group");
	}
}

public class Multiple extends BaseTask2 {
	public static void main(String[] args) {
		Multiple m = new Multiple();
		m.display();
		m.display2();
	}
}
