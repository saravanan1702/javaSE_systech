package interfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredictedMethod {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		//a stand for arrow just for function it's not valid and correct name we can assgin whatever we want
		Predicate<Integer> p = arrow -> arrow % 2 == 0;
		System.out.println("Enter The X :");
		x = sc.nextInt();
		System.out.println(p.test(x));
	}
}
