package interfaces;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterfaceWithFunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int a = sc.nextInt();
		Function<Integer, String> s = t -> t * 10 + "value";
		System.out.println(s.apply(a));
	}
}
