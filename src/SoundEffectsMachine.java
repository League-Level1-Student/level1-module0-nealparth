import java.applet.AudioClip;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	 JButton button= new JButton("sound1");
	  JButton button1= new JButton("sound2");
public static void main(String[] args) {
	SoundEffectsMachine em= new SoundEffectsMachine();
	em.showButton();
}

public void showButton() {
    System.out.println("Button clicked");
    JFrame frame= new JFrame();
    frame.setVisible(true);
       frame.add(button);
    button.addActionListener(this);
    JPanel panel= new JPanel();
    frame.add(panel);
    panel.add(button);
  
    panel.add(button1);
    button1.addActionListener(this);
   

  }

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonClicked = (JButton) e.getSource();
	if(buttonClicked.equals(button)){
		playSound("airplane-landing_daniel_simion.wav");
	}
}

private void playSound(String fileName) {
	
    AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName)); 
    sound.play();
}
}

