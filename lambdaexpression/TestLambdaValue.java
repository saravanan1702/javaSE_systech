package lambdaexpression;

public class TestLambdaValue {
	interface FuncInter1 {
		int operation(int a, int b);
	}

	interface FuncInter2 {
		void sayMessage(String message);
	}

	private int operate(int a, int b, FuncInter1 fobj) {
		return fobj.operation(a, b);
	}

	public static void main(String[] args) {
		FuncInter1 add = (int x, int y) -> x + y;
		FuncInter1 Multiply = (int x, int y) -> x * y;
		TestLambdaValue tobj = new TestLambdaValue();
		System.out.println("Addition is " + tobj.operate(12, 2, add));
		System.out.println("Multiplication is " + tobj.operate(2, 3, Multiply));
		FuncInter2 fobj = message -> System.out.println("Hello " + message);
		fobj.sayMessage("systech");
	}
}
