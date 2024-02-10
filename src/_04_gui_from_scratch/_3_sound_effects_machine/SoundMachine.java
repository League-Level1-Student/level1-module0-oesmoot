package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundMachine implements ActionListener {
public static void main(String[] args) {
	
}
void buttonPressed() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	panel.add(button1);
	frame.add(panel);
	frame.pack();
	button1.addActionListener(this);
}
private void playSound(String soundFile) {
	String path = "src/_04_gui_from_scratch/_3_sound_effects_machine/";
		File sound = new File(path+soundFile);
		if (sound.exists()) {
			new Thread(() -> {
			try {
				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(sound));
				clip.start();
				Thread.sleep(clip.getMicrosecondLength()/1000);
			}
			catch (Exception e) {
				System.out.println("Could not play this sound");
			}}).start();
 		}
		else {
			System.out.println("File does not exist");
		}
	
}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	playSound("sawing-wood-daniel_simon.wav");
}
}
