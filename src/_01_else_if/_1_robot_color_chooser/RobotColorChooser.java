
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot("batman");
	    //2. Make the robot draw a shape (this will take more than one line of code
		robot.penDown();
		while(true) {
		robot.move(80);
		robot.turn(90);
		robot.move(80);
		robot.turn(90);
		robot.move(80);
		robot.turn(90);
		robot.move(80);
		robot.setSpeed(10);
		
		//3. Set the pen width to 10
		robot.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String penColor = JOptionPane.showInputDialog( "What color pen would you like the robot to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if (penColor .equals("red")) {
			robot.setPenColor(Color.red);
		}
		else if(penColor.equals("blue")) {
			robot.setPenColor(Color.blue);
		}
		else if(penColor.equals("black")) {
			robot.setPenColor(Color.black);
		}
		else if (penColor.equals("white")) {
			robot.setPenColor(Color.white);
		}
		else {
			robot.setRandomPenColor();
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		}

		



	}
}
