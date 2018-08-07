import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		button.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "woohoo");

		// TODO Auto-generated method stub

	}

}
