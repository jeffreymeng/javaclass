/*
 * Programmer: Jeffrey Meng
 * Date: Mar 12, 2018
 * Purpose:
 */

package layouts;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutFrame implements ActionListener {
	private JButton[] buttons = new JButton[6];
	private final String password = "1234";
	private String userInputPassword = "";
	private JFrame frame;
	private JPanel panel1, panel2, panel3;
	private JLabel titleLabel, progressLabel, accessLabel;

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < buttons.length; i++) {
			if (e.getSource() == buttons[i] && i < (buttons.length - 2)) {
				accessLabel.setText("Enter pin and press enter");
				userInputPassword += String.valueOf(i + 1);
				
				//https://stackoverflow.com/a/4903603
				progressLabel.setText(new String(new char[userInputPassword.length()]).replace("\0", "*"));
				break;
			} else if (e.getSource() == buttons[(buttons.length - 2)]) {
				if (userInputPassword.equals(password)) {
					accessLabel.setText("Access Granted!");
					userInputPassword = "";
				} else {
					accessLabel.setText("Access Denied!");
					userInputPassword = "";
				}
				break;
			} else if (e.getSource() == buttons[(buttons.length - 1)]) {
				System.out.println(userInputPassword);
				System.exit(0);
				break;// unnecessary
			}
		}

	}

	public void setupWindow() {
		frame = new JFrame("Enter the pin");
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();

		frame.setLayout(new GridLayout(3, 1));

		panel1.setLayout(new GridLayout(2, 1));
		panel2.setLayout(new GridLayout(2, 3));
		panel3.setLayout(new FlowLayout());

		titleLabel = new JLabel("UltraSecurityPro2000+", JLabel.CENTER);
		panel1.add(titleLabel);

		progressLabel = new JLabel("", JLabel.CENTER);
		panel1.add(progressLabel);

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
			panel2.add(buttons[i]);
		}
		
		accessLabel = new JLabel("Enter pin and press enter", JLabel.CENTER);
		panel3.add(accessLabel);
		
		frame.getContentPane().add(panel1);
		frame.getContentPane().add(panel2);
		frame.getContentPane().add(panel3);

		frame.setSize(300, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		GridLayoutFrame window = new GridLayoutFrame();
		window.setupWindow();
	}
}
