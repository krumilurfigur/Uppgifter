/*
ett program med char-variabler
2019-09-19
Gabriel Öberg
*/

import javax.swing.*;

public class uppgift27 {
	public static void main(String[] args) {
		char c1 = '\u00D8';
		/* stort danskt Ö */
		
		char c2 = '\u00F8';
		/* litet danskt ö */
		
		char c3 = '\u03C0';
		/* Pi */
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		JOptionPane.showMessageDialog(null, c3);
	}
}