package whileloop;

import java.util.Scanner;

public class AveragePositiveNegative {
	public static void main(String[] args) {
		int a, xsum = 0, ysum = 0, xcount = 0, ycount = 0;
		float xavg, yavg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Ente The value :");
		a = sc.nextInt();
		while (a != 1000) {
			if (a > 0) {
				xsum += a;
				xcount++;// xcount=xcount+
			} else {
				ysum = -a;
				ycount++;
			}
			System.out.print("Enter The value :");
			a=sc.nextInt();
			
		}
		xavg=xsum/xcount;
		yavg=ysum/ycount;
		System.out.println("Positive Average is :"+xavg);
		System.out.println("Negative Average is :"+-(yavg));
	}
}
