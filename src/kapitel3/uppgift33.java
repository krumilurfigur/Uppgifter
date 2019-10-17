/*
ett program som beräknar en cirkels radie och area från ett värde som användaren skriver in
2019-09-26
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift33 {
	public static void main(String[] args) {
		Scanner tgb = new Scanner(System.in);
		System.out.println("skriv radien på en cirkel");
		
		double rad = tgb.nextDouble();
		double A = rad * rad * 3.1415926536;
		System.out.println("area: " + A);
		double O = 2 * rad * 3.1415926536;
		System.out.println("omkrets: " + O);
		
		
	}
}