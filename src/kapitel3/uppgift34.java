/*
ett program som läser in två tal och beräknar telefonräkningen
2019-09-27
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift34 {
	public static void main(String[] args) {
		Scanner tgb = new Scanner(System.in);
		System.out.println("hur många minuter du i telefonen per månad?");
		
		double min = tgb.nextDouble();
		System.out.println("hur många kronor kostar det per minut?");
		double pris = tgb.nextDouble();
		double kostnad = min * pris;
		System.out.println("telefon räkningen kostar " + kostnad +".");
	}
}