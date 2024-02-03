package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JButton butone = new JButton();
		frame.add(butone);
		frame.pack();
		butone.addActionListener(this);
		
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	JOptionPane.showMessageDialog(null, "Woohoo!");
	Random ran = new Random();
	int rand = ran.nextInt(5);
	if (rand == 0) {
		JOptionPane.showMessageDialog(null, "you will probably not win the lottery.");
	}
	else if (rand == 1) {
		JOptionPane.showMessageDialog(null, "a monkey will eat your lunch today.");
	}
	else if (rand == 2) {
		JOptionPane.showMessageDialog(null, "you will get a dissappointing fortune.");
	}
	else if (rand == 3) {
		JOptionPane.showMessageDialog(null, "you will blow out a candle sometime in the future.");
	}
	else if (rand ==4) {
		JOptionPane.showMessageDialog(null, "you will buy something sometime.");
	}
}

}
