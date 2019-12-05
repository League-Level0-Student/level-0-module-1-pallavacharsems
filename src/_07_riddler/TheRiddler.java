package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String response = JOptionPane.showInputDialog("A house is one story and evderything is pink. "
		+ "The kitchen is pink, the washing machine is pink, the drawers are pink, the couch is pink, the t.v. is pink, and etc.. What is the color of the stairs? ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (response.equals ("There are no stairs") || response.equals("There is no stairs")) {
JOptionPane.showMessageDialog(null, "You are correct!");
score = score + 1;
}	

		
		
		
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "You are wrong! You are a bot!");
}

		// 6. Add some more riddles
String ice = JOptionPane.showInputDialog(" Find and type the wrong word in the box below."
		+ " One time man went to the moon without any gear. He survived and took many pictures of our moon."
		+ " He later showed us what color moon rocks were. "
		+ " But the reason why he survived without any gear was beacause he was a a bot!");
if (ice.equalsIgnoreCase ("a")) {
JOptionPane.showMessageDialog(null, "You are correct!");
score = score + 1;
}	
else {
	JOptionPane.showMessageDialog(null, "You are wrong! You are a bot!");
}



		// 2. Make a pop up to show the score.
JOptionPane.showMessageDialog(null, "Your score is" + score);
		
	}
}

