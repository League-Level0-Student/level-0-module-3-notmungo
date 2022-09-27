package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Story {
public static void main(String[] args) {
	String story = JOptionPane.showInputDialog("Would you like to hear a story?");
	if (story.equals("No")) {
		JOptionPane.showMessageDialog(null, "I do not really care.");
	}
	else if (story.equals("Yes"));
	String story1 = JOptionPane.showInputDialog("Once upon a time, Johnny was running through the forest and something weird, what should it be? ");
	if (story1.equals("A monster")) {
		JOptionPane.showMessageDialog(null, "He has been eaten up");
       
	}
	else if (story1.equals("Nothing")) {
		JOptionPane.showMessageDialog(null, "He goes home and calls it a day") ;
	}
}
}
