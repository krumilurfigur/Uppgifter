/*
ett program som räknar ut när en boll står stilla efter att den har släppts
2019-10-10
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift53 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("from how high is the ball dropped?");
		double m = kb.nextInt();
		m = m * 100;
		
		int i = 0;
		double s = 0;
		
		while (m >= 1) {
			m = m * 0.7;
			i++;
		}
		System.out.println(i);
	}
}