package oops;

import java.util.Scanner;

class ThisWord{
	int idno;
	String name;
	int mark;
	ThisWord(int idno,String name,int mark){
		this.idno=idno;
		this.name=name;
		this.mark=mark;
	}
	void display() {
		System.out.println("ID NO :"+idno);
		System.out.println("Name  :"+name);
		System.out.println("Marks :"+mark);
	}
}
public class ThisKeyOperation {
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter The roll NO :");
      int rollNo=sc.nextInt();
      System.out.println("Enter The Name :");
      String name=sc.next();
      System.out.println("Enter The Mark :");
      int mark=sc.nextInt();
      //create class object and assigning user inputs to the object
      ThisWord t=new ThisWord(rollNo,name,mark);
      t.display();
	}
}
