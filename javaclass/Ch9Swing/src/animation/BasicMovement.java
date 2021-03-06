/*
 * Programmer: Jeffrey Meng
 * Date: Feb 14, 2018
 * Purpose:
 */

package animation;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class BasicMovement extends JPanel implements ActionListener {
	int x = 100;
	int y = 100;
	JFrame frame = new JFrame("Main Frame");

	public static void main(String[] args) {
		BasicMovement panel = new BasicMovement();
		panel.setupWindow(panel);
		panel.Test();
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		graphics.setColor(new Color(153, 204, 255));
		graphics.fillRect(x, y, 50, 50);

	}

	public void setupWindow(BasicMovement panel) {

		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);

	}

	public void Test() {
		Timer t = new Timer(5, this);
		t.start();
	}

	public void actionPerformed(ActionEvent e) {
		x++;
		y++;
		frame.repaint();
	}
	  
}
