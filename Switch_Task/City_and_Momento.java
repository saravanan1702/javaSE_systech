package Switch_Task;

import java.util.Scanner;

public class City_and_Momento {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String city;
		System.out.println("Enter City name and Find thats momento");
		System.out.println("Enter the city Name :");
		city = s.next();
		if (city.equalsIgnoreCase("Delhi")) {
			System.out.println("Red Fort ");
		} else if (city.equalsIgnoreCase("Agra")) {
			System.out.println("Taj Mahal");
		} else if (city.equalsIgnoreCase("Jaipur")) {
			System.out.println("Jal Mahal");
		} else {
			System.out.println("Invalid city Name...");
		}
	}
}
