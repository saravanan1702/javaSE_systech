package oops;
class TestThis{
	int idno;
	String name;
	int mark;
	TestThis(int idno,String name){
		this.idno=idno;
		this.name=name;
	}
	TestThis(int idno,String name,int mark){
//		this.idno=idno;
//		this.name=name;
		//we can assign in single line
		this(idno, name);
		this.mark=mark;
	}
	void display() {
		System.out.println("Roll No is :"+idno);
		System.out.println("Name  is   :"+name);
		System.out.println("Mark   is  :"+mark);
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
      TestThis t=new TestThis(12,"Jasmine"),t2=new TestThis(10,"Saravanan",95);
      t.display();
      t2.display();
      
	}
}
