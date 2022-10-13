
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 8th";
		String dadsBirthday = "July 27th";
		String myBirthday = "October 15th";
     
		// 2. Find out which birthday the user wants and and store their response in a variable
			    
	
        		// 3. Print out what the user typed
        String birthday = JOptionPane.showInputDialog(null, "Which birthday do you want");
        if (birthday.equals(momsBirthday)) {
			System.out.println(momsBirthday);
		}
		else if (birthday.equals(dadsBirthday)) {
			System.out.println(dadsBirthday);
		}
		else if (birthday.equals(myBirthday)) {
			System.out.println(myBirthday);
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
