
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class CheckPointQuizSensativeKeyboard implements KeyListener {
	JButton button= new JButton("sound");

	public static void main(String[] args) {
CheckPointQuizSensativeKeyboard em= new CheckPointQuizSensativeKeyboard();
em.showButton();
	}
	
	private void showButton() {
		// TODO Auto-generated method stub
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addKeyListener(this);
		JPanel panel= new JPanel();
		frame.add(panel);
		panel.add(button);
		frame.pack();

	}

	

	static void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	          }
	     }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stud
		speak("ouch");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
			
				
		
	
	
	
}

