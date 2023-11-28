package encapsulationpractice;

class Pro4 {
	public int a, b = 30;

	protected int getA() {
		return a;
	}

	protected void SetA(int a) {
		this.a = a;
	}

	protected int getB() {
		return b;
	}

	private void SetB(int b) {
		this.b = b;
	}
}

public class Enclass4 extends Pro4 {
	public static void main(String[] args) {
		Pro4 p = new Pro4();
        p.SetA(100);
        System.out.println(p.a);
        System.out.println(p.getA());
        System.out.println(p.b);
	}
}
