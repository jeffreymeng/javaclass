/*
 * Programmer: Jeffrey Meng
 * Date: Mar 14, 2018
 * Purpose:
 */

package forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextFieldPanel implements ActionListener {
	
	private JFrame frame;
	private JPanel controlPanel, inputPanel, displayPanel;
	private JLabel inputLabel, displayLabel;
	private JTextField inputField;
	private JButton submitButton, clearButton, exitButton;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submitButton) {
			displayLabel.setText(inputField.getText());
		} else if (e.getSource() == clearButton) {
			inputField.setText("");
			displayLabel.setText("");
		} else {
			System.exit(0);
		}

	}

	public void setupWindow() {
		frame = new JFrame("Easy Form");
		controlPanel = new JPanel();
		inputPanel = new JPanel();
		displayPanel = new JPanel();

		frame.setLayout(new GridLayout(3, 1));

		controlPanel.setLayout(new FlowLayout());
		inputPanel.setLayout(new FlowLayout());
		displayPanel.setLayout(new FlowLayout());

		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
		exitButton = new JButton("Exit");
		exitButton.addActionListener(this);
		
		controlPanel.add(submitButton);
		controlPanel.add(clearButton);
		controlPanel.add(exitButton);
		
		
		inputLabel = new JLabel("Enter Something: ");
		inputField = new JTextField(10);
		
		inputPanel.add(inputLabel);
		inputPanel.add(inputField);
		
		
		displayLabel = new JLabel("");
		
		displayPanel.add(displayLabel);
		
		
		frame.getContentPane().add(controlPanel);
		frame.getContentPane().add(inputPanel);
		frame.getContentPane().add(displayPanel);

		frame.setSize(300, 500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		TextFieldPanel window = new TextFieldPanel();
		window.setupWindow();
	}
}
