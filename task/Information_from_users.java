package task;

import java.util.Scanner;

public class Information_from_users {
	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int age,id;
       String city,name,email_id,phone_No;
       System.out.println("Enter User Name :");
       name=s.next();
       System.out.println("Enter User Age :");
       age=s.nextInt();
       System.out.println("Enter User Id :");
       id=s.nextInt();
       System.out.println("Enter User Phone Number :");
       phone_No=s.next();
       System.out.println("Enter User City :");
       city=s.next();
       System.out.println("Enter User E-mail Id :");
       email_id=s.next();
//       Printing all the information
       System.out.println("Name 	:"+name);
       System.out.println("ID       :"+id);
       System.out.println("AGe      :"+age);
       System.out.println("Phone NO :"+phone_No);
       System.out.println("city 	:"+city);
       System.out.println("E-Mail Id:"+email_id);
       
       
       
	}
}
