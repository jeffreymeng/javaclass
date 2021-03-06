/*
 * Programmer: Jeffrey Meng
 * Date: Feb 2, 2018
 * Purpose: Clickable Button in a window
 */

package basicSwing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ClickableButton implements ActionListener {

	private JButton trueButton;
	private JButton falseButton;
	private JButton exitButton;
	private JFrame frame;

	public static void main(String[] args) {
		ClickableButton window1 = new ClickableButton();
		window1.setupWindow(1);
		ClickableButton window2 = new ClickableButton();
		window2.setupWindow(2);
		
		System.out.println("Hi");

	} 

	public void actionPerformed(ActionEvent e) {
		//System.out.println(e);
		// get the source of the button and see if it is the same.

		if (e.getSource() == trueButton) {
			System.out.println("You are wrong!");
		} else if (e.getActionCommand() == "False") {
			System.out.println("You are right!");
			
		} else if (e.getSource() == exitButton) {
			System.exit(0);
		}
	}

	public void setupWindow(int window) {
		frame= new JFrame("Clickable Button Window");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());

		trueButton = new JButton("True");

		// this class is the action listener for this button
		trueButton.addActionListener(this);
		trueButton.setEnabled(false);
		panel.add(trueButton);

		falseButton = new JButton("False");
		falseButton.addActionListener(this);
		panel.add(falseButton);

		exitButton = new JButton("Exit");
		exitButton.addActionListener(this);
		panel.add(exitButton);



		frame.add(panel, "Center");
		frame.setTitle("Nine is the square root of three.");
		int l = 400;
		int w = 500;
		frame.setSize(l, w);
		int x = 200;
		int y = 100;
		if (window == 1) {
			frame.setLocation(x, y);
		} else {
			frame.setLocation(x + l, y);
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
