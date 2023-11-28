package whileloop;

import java.util.Scanner;

public class StarPattern9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the N value :");
		n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			int j = i;
			while (j <= n) {
				System.out.print(" ");
				j++;
			}
			int k=1;
			while(k<=i) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			i++;
		}
	}
}
