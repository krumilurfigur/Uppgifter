/*
ett program som läser in två tal och beräknar telefonräkningen
2019-10-03
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift41 {
	public static void main(String[] args) {
		Scanner tgb = new Scanner(System.in);
		System.out.println("hur många minuter du i telefonen per månad?");
		
		double min = tgb.nextDouble();
		System.out.println("hur många kronor kostar det per minut?");
		double pris = tgb.nextDouble();
		double kostnad = min * pris;
		if (kostnad >= 1000) {
			kostnad = kostnad * 0.9;
		}
		System.out.println("telefon räkningen kostar " + kostnad +".");
	}
}