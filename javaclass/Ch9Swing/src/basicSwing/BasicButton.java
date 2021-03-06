/*
 * Programmer: Jeffrey Meng
 * Date: Feb 2, 2018
 * Purpose:
 */

package basicSwing;

import java.awt.FlowLayout;

import javax.swing.*;

public class BasicButton {

	public static void main(String[] args) {
		BasicButton window = new BasicButton();
		window.setupWindow();

	}

	public void setupWindow() {
		// New JFrame
		JFrame frame = new JFrame("Basic Button Window");
		
		//a panel is like a basic container.
		JPanel panel = new JPanel();
		
		//create a "flowing" layout, where components are added to the first available space.
		panel.setLayout(new FlowLayout());
		
		//make a new button with label 'True'
		JButton trueButton = new JButton("True");
		
		//Add button to the panel
		panel.add(trueButton);
		
		JButton falseButton = new JButton("False");
		panel.add(falseButton);
		
		//Add the panel to the center of the window
		frame.add(panel, "Center");
		
		//set the size in px
		frame.setSize(400, 500);
		
		//center the window on the screen
		frame.setLocationRelativeTo(null);
		
		//exit the program when the user closes the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//show the frame
		frame.setVisible(true);
		
	}

}
