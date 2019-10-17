/*
Ett program som visar mitt namn, address och telefon nummer
2019-09-13
Gabriel Öberg
*/

import javax.swing.*;

public class uppgift21 {
	public static void main(String[] args) {
		String name;
		name = "Gabriel";
		String adrs;
		adrs = "storgatan 19";
		String tfnr;
		tfnr = "070-1234567890";
		String ginfo;
		ginfo = "Gabriel\nstorgatan19\n070-1234567890";
		JOptionPane.showMessageDialog(null, ginfo);
	}
}