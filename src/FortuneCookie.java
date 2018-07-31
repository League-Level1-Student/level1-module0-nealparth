import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();

	}

	private void showButton() {
		JFrame bot = new JFrame();
		bot.setVisible(true);
		JButton button = new JButton();
		bot.add(button);

		System.out.println("Button clicked");
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("Button clicked");

		JOptionPane.showMessageDialog(null, "woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "jack.jpeg");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "morgan.jpg");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "leonardo.jpeg");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "arnold.jpeg");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "jackinTheBox.png");
		}
		// TODO Auto-generated method stub

	}

}
