package methodTask;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class PrintingCurrentDate {
	public static void main(String[] args) {
      LocalDateTime d=LocalDateTime.now();
      System.out.println("Current data and time :"+d.getDayOfMonth()+" "+d.getYear());
      LocalTime l=LocalTime.now();
      LocalDate date=LocalDate.now();
      System.out.println("Current Time is :"+l);
      System.out.println("Current Date is :"+date);
      
	}
}
