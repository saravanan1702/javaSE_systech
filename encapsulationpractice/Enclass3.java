package encapsulationpractice;
class Pro3{
	public int a=10;
	protected int b=20;
	public int geta() {
		return a;
	}
	public int getb() {
		return b;
	}
}
public class Enclass3 extends Pro3{
	public static void main(String[] args) {
      Pro3 p=new Pro3();
      System.out.println(p.geta());
      System.out.println(p.getb());
	}
}
