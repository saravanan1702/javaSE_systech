package encapsulationpractice;

class Pro1 {
	public int a = 10, b = 20;

	public int geta() {
		return a;
	}

	public int getb() {
		return b;
	}
}

public class Enclass extends Pro1 {
	public static void main(String[] args) {
      Pro1 p=new Pro1();
      System.out.println(p.geta());
      System.out.println(p.getb());
	}
}
