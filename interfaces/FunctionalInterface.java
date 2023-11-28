package interfaces;

import java.util.function.Predicate;

public class FunctionalInterface {
	public static void main(String[] args) {
		// ->(arrow function) this is mean lambda function
		//predefined class //create object for the class //we check it using lambda function
		Predicate<String> data = a -> a.length() > 6;
		System.out.println(data.test("v"));
		System.out.println(data.test("saravanan"));
	}
}
