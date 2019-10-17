/*
ett program som lägger ihop kvadraterna av n och alla tal som är mindre än n
2019-10-10
Gabriel Öberg
*/

import java.util.Scanner;

public class uppgift51 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("N");
		int n = kb.nextInt();
		
		int i = 0;
		int s = 0;
		while (i <= n) {
			s = s + i * i;
			i++;
		}
		System.out.println(s);

	}
}