package _02_unbirthday;


import javax.swing.JOptionPane;


public class Unbirthday {
public static void main(String[] args) {
	

	String response = JOptionPane.showInputDialog("When is your Birthday?");
	if(response.equals("11/13")) {
		JOptionPane.showMessageDialog(null, "Happy Birthday");
		
	}
	else {
		JOptionPane.showMessageDialog(null, "Have a very merry unbirthday!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}