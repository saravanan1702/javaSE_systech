package multithreading;

public class SetPriority extends Thread{
	public void run() {
		System.out.println("Running");
	}

	public static void main(String[] args) {
		SetPriority t1=new SetPriority();
			SetPriority t2=new SetPriority();
			t1.setPriority(4);
			t2.setPriority(7);
			System.out.println("Priority of Thread t1 is :"+t1.getPriority());
			System.out.println("Priority of Thread  t2 is :"+t2.getPriority());
	}
}
