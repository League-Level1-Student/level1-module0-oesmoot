package _03_gui_with_help._2_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2021
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address” )
		String isek = ("https://static.wikia.nocookie.net/p__/images/1/12/Isaac_.png/revision/latest/scale-to-width-down/250?cb=20180611062057&path-prefix=protagonist");
		// 2. create a variable of type "Component" that will hold your image
		Component iesack;
		// 3. use the "createImage()" method below to initialize your Component
		iesack = createImage(isek);
		// 4. add the image to the quiz window
		quizWindow.add(iesack);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String izac = JOptionPane.showInputDialog("who is this?");
		// 7. print "CORRECT" if the user gave the right answer
		if (izac.equalsIgnoreCase("isaac")) {
			JOptionPane.showMessageDialog(null, "CORRECT!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "HAHA INCORRECT LOL");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(iesack);
		// 10. find another image and create it (might take more than one line
		// of code)
		String tainted = ("https://i.redd.it/znh2d2kh7j5c1.jpg");
		Component lost;
		lost = createImage(tainted);
		// 11. add the second image to the quiz window
		quizWindow.add(lost);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String tainlozt = JOptionPane.showInputDialog("who is this?");
		// 14+ check answer, say if correct or incorrect, etc.
		if (tainlozt.equalsIgnoreCase("tainted lost")) {
			JOptionPane.showMessageDialog(null, "WAOW SO COOL GOOD JOB :)");
		}
		else {
			JOptionPane.showMessageDialog(null, "LOL MY GRANDMA COULD ANWER THAT (NOT REALLY THOUGH)");
		}
	}

	private Component createImage(String imageUrl) {
		JLabel imageLabel = new JLabel();
		URL url;
		try {
			url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			imageLabel.setIcon(icon);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "I can't find your image!!");
		}
		
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
