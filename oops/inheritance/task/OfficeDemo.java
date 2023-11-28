package oops.inheritance.task;

class Employee {
	void work() {
		System.out.println("Working ");
	}

	void getSalary() {
		System.out.println("Getting salary on every 1st of month");

	}
}

class HR extends Employee {
	void work() {
		System.out.println("Hr is recuriting for new employee");
	}

	void addNewEmployee() {
		System.out.println("New Employee are selected by HR");
	}
}

public class OfficeDemo {
	public static void main(String[] args) {
		HR h = new HR();
		h.addNewEmployee();
		h.work();
		h.getSalary();
	}
}
