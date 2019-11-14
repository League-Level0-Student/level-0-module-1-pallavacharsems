package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String Joseph = "good coder!";
String Pablo = "smart!";
String JD = "not a yeet!";
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String response = JOptionPane.showInputDialog("What is your name");

		// 3. In a pop-up, tell the user what is remarkable about that person.
	if (response.equals ("Joseph")) {
		JOptionPane.showMessageDialog(null, "You are a " + Joseph);
	}
	if (response.equals ("Pablo")) {
		JOptionPane.showMessageDialog(null, "You are " + Pablo);
	}
	if (response.equals ("JD")) {
		JOptionPane.showMessageDialog(null, "You are " + JD);
	
	
	JOptionPane.showMessageDialog(null,"You are a god, " + response );

	}
}
}

