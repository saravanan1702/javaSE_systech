package lambdaexpression;

interface Expressionvalue {
	int setValue(int a, int b, int c,int d);
}

public class Demo2 {
	public static void main(String[] args) {
		//define that method because we can't create object and call that method
		Expressionvalue ex = (int a, int b, int c,int d) -> {
			return (a + b - c * d);
		};
		System.out.println("Result of Expression :"+ex.setValue(1,2,3,4));
	}
}
