package package2;

import java.util.Calendar;

public class Program2 {
	public static void main(String[] args) {
		Calendar c=Calendar.getInstance();
		System.out.println("current Date :"+c.get(Calendar.DATE));
		System.out.println("Current Month :"+c.get(Calendar.MONTH));
		System.out.println("Current Year :"+c.get(Calendar.YEAR));
	}

}
