package packages;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DatandTimePack {
	public static void main(String[] args) {
    LocalDate date=LocalDate.now();
    System.out.println("CurrenDate :"+date);
    LocalTime t=LocalTime.now();
    System.out.println("Current Time is :"+t);
    LocalDateTime d=LocalDateTime.now();
    System.out.println("Curent date and time :"+d);
    
	}
}
