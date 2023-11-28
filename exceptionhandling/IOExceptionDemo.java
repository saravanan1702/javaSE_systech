package exceptionhandling;

import java.util.Scanner;

public class IOExceptionDemo {
	public static void main(String[] args) {
      Scanner sc=new Scanner("");
      System.out.println(" "+sc.nextLine());
      sc.ioException();
      sc.close();
	}
}
