/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
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

	public static void main(String[] args) throws Exception {
		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
                quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // This will make sure the program exits when you close the window

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image Address”)
String image="https://t2.rbxcdn.com/b01b2040f39f5210f942067a62331da7";
		// 2. create a variable of type "Component" that will hold your image
Component bot;
		// 3. use the "createImage()" method below to initialize your Component
bot= createImage(image);
		// 4. add the image to the quiz window
quizWindow.add(bot);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String guess= JOptionPane.showInputDialog("What type of face is this?");
		// 7. print "CORRECT" if the user gave the right answer
if(guess.equalsIgnoreCase("awesome face")) {
	System.out.println("CORRECT");
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	System.out.println("INCORRECT");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(bot);
		// 10. find another image and create it (might take more than one line of code)
String picture="https://www.mlbstatic.com/mlb.com/images/share/112.jpg";
Component dot;
dot= createImage(picture);
		// 11. add the second image to the quiz window
quizWindow.add(dot);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question
String thought= JOptionPane.showInputDialog("Where are the cubs from?");
		// 14+ check answer, say if correct or incorrect, etc.
if(thought.equalsIgnoreCase("Chicago")){
	System.out.println("correct");
	
	
}
else {
	System.out.println("incorrect");
}
	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





