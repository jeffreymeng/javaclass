/*
 * Programmer: Jeffrey Meng
 * Date: Feb 1, 2018
 * Purpose:
 */

package basicSwing;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColumbianNuclearFootball implements ActionListener {
	private JButton b1, b2, b3;

	public static void main(String[] args) {
		ColumbianNuclearFootball w = new ColumbianNuclearFootball();
		w.setupWindow();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1)
			System.out.println("Nuclear Launched");
		else if (e.getSource() == b2)
			System.out.println("Button 2 was pressed");
		else if (e.getSource() == b3)
			System.exit(0);
	}

	public void setupWindow() {
		JFrame f = new JFrame("Nuclear football");
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout());
		b1 = new JButton("Launch Nuclear");
		b1.addActionListener(this);
		p.add(b1);
		b2 = new JButton("Launch Conventional");
		b2.addActionListener(this);
		p.add(b2);
		b3 = new JButton("Exit");
		b3.addActionListener(this);
		p.add(b3);
		f.getContentPane().add(p, "Center");
		f.setSize(300, 300);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}