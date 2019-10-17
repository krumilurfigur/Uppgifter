/*
ett program som räknar ut den harmoniska serien för N
2019-10-10
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift52 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("N");
		int n = kb.nextInt();
		
		double i = 1;
		double s = 0;
		
		while (i <= n) {
			s = s + 1/i;
			i++;
		}
		System.out.println(s);
	}
}