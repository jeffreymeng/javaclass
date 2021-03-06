/*
 * Programmer: Jeffrey Meng
 * Date: Feb 8, 2018
 * Purpose:
 */

package mouse;

import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class MousePanel extends JPanel implements MouseListener {

	public static void main(String[] args) {
		MousePanel panel = new MousePanel();
		panel.setupWindow(panel);

	}

	public MousePanel() {
		addMouseListener(this);
	}

	public void setupWindow(MousePanel p) {
		JFrame frame = new JFrame("Mouse Panel");
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(p);
		frame.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println(e);
		System.out.println("Mouse clicked");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("Mouse pressed");

	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("Mouse released");

	}

	public void mouseEntered(MouseEvent e) {
		System.out.println("Mouse entered");

	}

	public void mouseExited(MouseEvent e) {
		System.out.println("Mouse exited");

	}

}
