package oops.innerandlocalClass;

class AbstracExample {
	int x = 100, y = 200;
	int n = 500;

	void dis1() {
		System.out.println("Data Stored");
	}

	void dis2() {
		System.out.println("Data Deleted");
	}

	private void dis3() {
		System.out.println("data Copied");
	}
	public void dis4() {
		dis3();//we can access private method only access public method
		System.out.println("Private Method Invoked");
	}
}

public class AbstractionExample extends AbstracExample {
	public static void main(String[] args) {
		AbstractionExample a=new AbstractionExample();
		a.dis1();
		a.dis2();
		int e=a.y;
		System.out.println(e);
		a.dis4();
	}
}
