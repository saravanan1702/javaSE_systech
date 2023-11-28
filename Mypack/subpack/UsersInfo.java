package Mypack.subpack;

import java.util.Scanner;

public class UsersInfo {
   public void UserInformation() {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Your Name :");
	   String name=sc.next();
	   System.out.println("Enter Your Age :");
	   int age=sc.nextInt();
	   System.out.println("Enter Your Mobile Number :");
	   String phno=sc.next();
	   System.out.println("Name    :"+name);
	   System.out.println("Age     :"+name);
	   System.out.println("PhoneNO :"+name);
   }
}
