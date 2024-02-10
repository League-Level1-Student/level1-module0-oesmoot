package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
public void button1() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	frame.add(panel);
	button1.setText("Duck video");
	button2.setText("frog video");
	button3.setText("kitten steak video");
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
}

void showDucks() {
     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
     playVideo("https://www.youtube.com/watch?v=5LB_y-nudGU");
}

void playVideo(String videoID) {
     
     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
     //work on some Linux implementations
     try {
     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
     if (Runtime.getRuntime().exec(new String[] {
      "which", "xdg- open" }).getInputStream().read() != -1) {
     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
     }
     } else {
          URI uri = new URI(videoID);
          java.awt.Desktop.getDesktop().browse(uri);
     }      } catch (Exception e) {
          e.printStackTrace();
     }
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonPressed = (JButton) e.getSource();
	if (buttonPressed == button1) {
		showDucks();
	}
	if (buttonPressed == button2) {
		showFrog();
	}
	if (buttonPressed == button3) {
		showFluffyUnicorns();
	}
}
}
