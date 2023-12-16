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
		}
	}
	public void house(int height) {
		rob.move(height);
		rob.turn(90);
		rob.move(25);
		rob.turn(90);
		rob.move(height);
		rob.turn(-90);
		rob.move(10);
		rob.turn(-90);
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
