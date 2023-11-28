package conditional_nested_if;

import java.util.Scanner;

public class UserName {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String username;
		int pass;
		System.out.println("Enter Your UserName:");
		username = s.next();
		System.out.println("Enter YOur Password :");
		pass = s.nextInt();
		if (username.equals("saravanan")) {
			if (pass == 1702) {
				System.out.println("Login Sucessfully");
			} else {
				System.out.println("password Incorrect ");
			}
		} else {
			System.out.println("UserName is Incorrect");
		}

	}
}
