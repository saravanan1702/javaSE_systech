package do_while_loop;

import java.util.Scanner;

public class AverageOfPositiveandNegative {
	public static void main(String[] args) {
		int a, xsum = 0, ysum = 0, xcount = 0, ycount = 0;
		float xavg, yavg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Value :");
		a = sc.nextInt();
		do {
			if (a > 0) {
				xsum = xsum + a;
				xcount++;
			} else {
				ysum -= a;
				ycount++;
			}
			System.out.println("Enter the Value :");
			a = sc.nextInt();
		} while (a != 1000);
		xavg = xsum / xcount;
		yavg = ysum / ycount;
		System.out.println("Average of Positive Value :" + xavg);
		System.out.println("Average of Negative Value :" + -(yavg));
	}
}
