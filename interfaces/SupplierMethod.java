package interfaces;

import java.util.function.Supplier;

public class SupplierMethod {
	public static void main(String[] args) {
		//number generate randomly
      Supplier<Double>s=()->Math.random();
      System.out.println(s.get());
	}
}
