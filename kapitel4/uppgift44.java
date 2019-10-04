/*
ett program som läser in och säger om brevet har tillåtna mått.
2019-10-04
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift44 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What's the length of your letter? (mm)");
		Double L = kb.nextDouble();
		
		System.out.println("What's the width of your letter? (mm)");
		Double W = kb.nextDouble();
		
		System.out.println("What's the thickness of your letter? (mm)");
		Double T = kb.nextDouble();
		
		if ( L >= 140 && L <= 600) {
			if ( W >= 90) {
				if (T <= 100) {
					if (L+W+T <= 900) {
						System.out.println("OK dimensions");
					}
					else {
						System.out.println("Faulty dimensions");
					}
				}
				else {
					System.out.println("thickness if faulty");
				}
			}
			else {
				System.out.println("Width is faulty");
			}
		
		}
		else {
			System.out.println("Length is faulty");
		}
	}
}