/*
Ett program som frågar efter namn och efternamn
2019-09-13
Gabriel Öberg
*/

import javax.swing.*;

public class uppgift23	 {
	public static void main(String[] args) {
		String fnamn = JOptionPane.showInputDialog(null, "Vad heter du i fornamn?");
		String enamn = JOptionPane.showInputDialog(null, "Vad heter du i efternamn?");
		String halsning = "Välkommen " + fnamn + " " + enamn;
		JOptionPane.showMessageDialog(null, halsning);
	}
}