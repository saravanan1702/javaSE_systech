package encapsulationpractice;
class Pro2{
	public int a=10;
	private int b=20;
	public int geta() {
		return a;
	}
	private int getb() {
		return b;
	}
	public int geta_and_b() {
		System.out.println(a);
		return (b);
	}
}
public class Enclass2 extends Pro2 {
	public static void main(String[] args) {
    Pro2 p=new Pro2();
	/*
	 * System.out.println(p.a); System.out.println(p.geta());
	 */
   System.out.println(p.geta_and_b());
	}
}
