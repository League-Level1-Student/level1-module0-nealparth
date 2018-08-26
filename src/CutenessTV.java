import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV implements ActionListener {
	JButton button1= new JButton("video1");
	JButton button2= new JButton("video2");
	JButton button3= new JButton("video3");
	
public static void main(String[] args) {
	CutenessTV tv= new CutenessTV();
	tv.showButton();
}

private void showButton() {
	// TODO Auto-generated method stub
	System.out.println("Button Clicked");
	JFrame frame= new JFrame();
	frame.setVisible(true);
	button1.addActionListener(this);
	JPanel panel= new JPanel();
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	button2.addActionListener(this);
	panel.add(button3);
	button3.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonClicked = (JButton) e.getSource();
	if(buttonClicked.equals(button1)) {
		showDucks();
	}
	else if(buttonClicked.equals(button2)) {
		showFrog();
	}
	else if(buttonClicked.equals(button3)) {
		showFluffyUnicorns();
	}
}

void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
}