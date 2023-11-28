package interfaces;

import java.util.Scanner;
import java.util.function.Predicate;

public class LoginOperationWithPredictedMethod {
	public static void main(String[] args) {
		String x, y;
		int pass;
		Scanner sc = new Scanner(System.in);
		System.out.println("give user name for login portal :");
		String us=sc.next();
//		Predicate<String> user = a -> a.equals("admin");
		Predicate<String> user = a -> a.equals(us);
		System.out.println("give password for user name :");
		int uspas=sc.nextInt();
//		Predicate<String> password = a -> a.equals("123");
		Predicate<Integer> password = a -> a==(uspas);
		System.out.println("Enter the UserName :");
		x = sc.next();
		System.out.println("Enter The Password :");
//		y = sc.next();
		pass=sc.nextInt();
		if (user.test(x) && password.test(pass)) {
			System.out.println("Login Successfully...");
		} else {
			System.out.println("User Name or Password incorrect");
		}

	}
}
