package multithreading;

public class Thread6_PriorityAndName {
	public static void main(String[] args) {
		System.out.println("Name " + Thread.currentThread());
		System.out.println("Priority :" + Thread.currentThread().getPriority());
		Thread t = new Thread().currentThread();
		t.setName("saravanan");
		System.out.println("Name:" + Thread.currentThread().getName());
      
	}
}
