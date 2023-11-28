package encapsulationpractice;

import java.util.Scanner;

class Encap1 {
	public String sname;
	public int sid;
	public int smark;

	public String getSname() {
		return sname;
	}

	public void setSname(String name) {
		this.sname = name;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getMark() {
		return smark;
	}

	public void setMark(int mark) {
		this.smark = mark;
	}
}

public class Program1 {
	public static void main(String[] args) {
      Encap1 en=new Encap1();
      Scanner sc=new Scanner(System.in);
      String a;
      int b,c;
      System.out.println("Student ID :");
      b=sc.nextInt();
      System.out.println("Student Name :");
      a=sc.next();
      System.out.println("Student Mark :");
      c=sc.nextInt();
      en.setSid(b);
      en.setSname(a);
      en.setMark(c);
      System.out.println("Student Id    :"+en.getSid());
      System.out.println("Student Name  :"+en.getSname());
      System.out.println("Student Mark  :"+en.getMark());
	}
}
