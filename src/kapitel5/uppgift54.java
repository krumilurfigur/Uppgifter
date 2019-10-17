/*
ett program som kan upprepat räkna ut när en boll står stilla efter att den har släppts,
 och avbrytas genom att skriva in 0
2019-10-11
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift54 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double m = 1;
		
		while (m != 0) {
			System.out.println("from how high is the ball dropped? (0 to exit)");
			m = kb.nextInt();
			
			if (m == 0) {
				System.out.println("exiting program");
				break;
			}
			m *= 100;

			int i = 0;
			
			while (m >= 1) {
				m *= 0.7;
				i++;
				if (m < 1) {
					System.out.println(i + " bounces");
				}
			}
		}
	}
}