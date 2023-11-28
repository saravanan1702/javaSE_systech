package exceptionhandling;

public class IllegalException {
	public static void print(int a, int b) {
      int x=a+b;
      System.out.println("Addition :"+x);
	}
	public static void main(String[] args) {
		int n1=3;
		int n2=3;
		if(n1>=0 && n2>=0) {
			IllegalException.print(n1, n2);
		}
		else {
			throw new IllegalStateException("Not Possive Integer");
		}
	}
}
