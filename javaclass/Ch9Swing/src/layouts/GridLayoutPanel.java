/*
 * Programmer: Jeffrey Meng
 * Date: Mar 12, 2018
 * Purpose:
 */

package layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutPanel implements ActionListener {
	private JButton[] buttons = new JButton[6];
	private final String password = "1234";
	private String userInputPassword = "";

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < buttons.length; i++) {
			if (e.getSource() == buttons[i] && i < (buttons.length - 2)) {
				userInputPassword += String.valueOf(i + 1);
				 break;
			} else if (e.getSource() == buttons[(buttons.length - 2)]) {
				if (userInputPassword.equals(password)) {
					System.out.println("Pin Correct");
					userInputPassword = "";
				} else {
					System.out.println("Pin Incorrect");
					userInputPassword = "";
				}
				break;
			} else if (e.getSource() == buttons[(buttons.length - 1)]) {
				System.out.println(userInputPassword);
				System.exit(0);
				break;//unnecessary
			}
		}

	}

	public void setupWindow() {
		JFrame frame = new JFrame("Enter the pin");
		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(2, 3));

		String name;
		for (int i = 0; i < buttons.length; i++) {
			if (i < (buttons.length - 2)) {
				name = String.valueOf(i + 1);
			} else if (i < (buttons.length - 1)) {
				name = "Enter";
			} else if (i < (buttons.length)) {
				name = "Cancel";
			} else {
				name = "Unknown";
			}
			buttons[i] = new JButton(name);
			buttons[i].addActionListener(this);
			panel.add(buttons[i]);
		}

		frame.getContentPane().add(panel, "Center");

		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GridLayoutPanel window = new GridLayoutPanel();
		window.setupWindow();
	}
}
