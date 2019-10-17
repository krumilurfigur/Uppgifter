/*
ett program som läser in och säger om det lönar sig att köpa årskort eller inte
2019-10-03
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift42 {
	public static void main(String[] args) {
		Scanner tgb = new Scanner(System.in);
		System.out.println("hur mycket kostar ett årskort?");
		double åk = tgb.nextDouble();
		
		System.out.println("hur mycket kostar det per besök annars?");
		double bp = tgb.nextDouble();
		
		System.out.println("hur många gånger tänker du besöka gymmet per år?");
		int bk = tgb.nextInt();
		
		if (bk * bp < åk) {
			System.out.println("årskort lönar sig inte.");
		}
		else {
			if (bk * bp == åk) {
				System.out.println("Det spelar ingen roll om du köper biljett eller årskort.");
			}
			else {
				System.out.println("Årskort är bättre");
			}
		}
	}
}