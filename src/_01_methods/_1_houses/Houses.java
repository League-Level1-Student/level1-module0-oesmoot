package _01_methods._1_houses;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */
public class Houses {
	Robot rob = new Robot();
	public void run() {
		// Check the recipe to find out what code to put here
		rob.setSpeed(100);
		rob.moveTo(10, 550);
		rob.penDown();
		for (int i = 0; i<10; i++) {
			String height = JOptionPane.showInputDialog("what is the height of your house?");
			String color = JOptionPane.showInputDialog("what color do you choose?");
			if (color.equals("red")) {
			house(height,Color.red);
			}
			else if (color.equals("orange")) {
				house(height,Color.orange);
			}
			else if (color.equals("yellow")) {
				house(height,Color.yellow);
			}
			else if (color.equals("green")) {
				house(height,Color.green);
			}
			else if (color.equals("blue")) {
				house(height,Color.blue);
			}
			else if (color.equals("purple")) {
				house(height,Color.magenta);
			}
			else {
				house(height,Color.black);
			}
		}
	}
	public void house(int height) {
		rob.move(height);
		if (height <121) {
			drawPointyRoof();
		}
		else {
			drawFlatRoof();
		}
		rob.move(height);
		rob.turn(-90);
		rob.setPenColor(Color.green);
		rob.move(10);
		rob.turn(-90);
	}
	private void drawFlatRoof() {
		rob.turn(90);
		rob.move(40);
		rob.turn(90);
	}
	private void drawPointyRoof() {
		rob.turn(45);
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.turn(45);
	}
	public void house (String height, Color col) {
		rob.setPenColor(col);
	if (height.equals("small")) {
		house(60);
	}
	else if (height.equals("medium")) {
		house(120);
	}
	else if (height.equals("large")) {
		house(250);
	}
	}
}
