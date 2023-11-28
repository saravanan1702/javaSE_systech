package interfaces;

import java.util.Scanner;
import java.util.function.Consumer;

class Base1 {
	int age;

	// getter
	public int getAge() {
		return age;
	}

	// setter
	public void setAge(int age) {
		this.age = age;
	}

}

public class InterFunctionWithConsumer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age :");
		int a=sc.nextInt();
		Base1 b=new Base1();
		Consumer<Base1>n=t->t.setAge(a);
		n.accept(b);
		System.out.println(b.getAge());
	}
}
