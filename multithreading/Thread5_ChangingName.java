package multithreading;

public class Thread5_ChangingName {
	public static void main(String[] args) {
       Thread t=new Thread().currentThread();//Getting current thread
       System.out.println("Current Thread is ="+t);
       t.setName("Saravanan");//by default it name is main, we can change the name into what we want to set name to thread
       System.out.println("After Changing Name is ="+t);
	}
}
