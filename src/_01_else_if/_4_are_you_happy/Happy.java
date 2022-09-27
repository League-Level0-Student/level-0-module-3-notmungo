package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog( "Are you happy?");
	
	if (happy.equals("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	else if (happy.equals("no")) {
		String happy1 = JOptionPane.showInputDialog( "Do you want to be happy?");
		if(happy1.equals("yes")) {
			JOptionPane.showMessageDialog(null, "Change something.");
		}
		else if(happy1.equals("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
		}
	}
	
	 
	
}
}
