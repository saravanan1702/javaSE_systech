package oops;

class Task {
	int x = 100;
	int y = 200;
	int z = 0;

	public void add() {
		z = x + y;
		System.out.println("Sum of Two Number :" + z);
	}
}

class Task2 extends Task {
	int k = 100;
	int s = 200;
	int m = 0;

	public void sub() {
		m = k - s;
		System.out.println("Subtraction of Two Numbers :" + m);
	}
}

public class MultipleTask02 extends Task2 {
	public static void main(String[] args) {
		MultipleTask02 m = new MultipleTask02();
		m.add();
		m.sub();
	}
}
