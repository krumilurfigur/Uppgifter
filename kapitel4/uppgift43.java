/*
ett program som läser in och säger om det lönar sig att köpa årskort eller inte
2019-10-03
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift43 {
	public static void main(String[] args) {
		Scanner tgb = new Scanner(System.in);
		System.out.println("Hur många poäng fick du på provet?");
		int p = tgb.nextInt();
		if (p < 25) {
			System.out.println("du fick F");
		}
		else if (p < 30) {
			System.out.println("du fick E");
		}
		else if (p < 35) {
			System.out.println("du fick D");
		}
		else if (p < 40) {
			System.out.println("du fick C");
		}
		else if (p < 45) {
			System.out.println("du fick B");
		}
		else if (p <= 50) {
			System.out.println("du fick A");
		}
		else if (p > 50) {
			System.out.println("nej de fick du inte");
		}

	}
}