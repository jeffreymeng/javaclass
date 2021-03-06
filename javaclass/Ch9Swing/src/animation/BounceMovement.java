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
public class BounceMovement extends JPanel implements ActionListener, forms.AnimationPanel {
	int x = 100;
	int y = 100;
	double ys = 1;// speed
	double xs = 1;
	int rectwidth = 50;
	int rectheight = 50;
	int width = 600;
	int height = 400;
	
	JFrame frame = new JFrame("Main Frame");

	public static void main(String[] args) {
		BounceMovement panel = new BounceMovement();
		panel.setupWindow(panel);
		panel.start();
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		graphics.setColor(new Color(153, 204, 255));
		graphics.fillRect(x, y, rectwidth, rectheight);

	}

	public void setupWindow(BounceMovement panel) {

		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		width = frame.getContentPane().getWidth();//not really needed, this should be the same as the frame width.
		height = frame.getContentPane().getHeight();//the content pane is the height minus the top title bar.

	}

	public void start() {
		Timer t = new Timer(10, this);
		t.start();
	}

	public void actionPerformed(ActionEvent e) {
		x += (int) xs;
		y += (int) ys;
		
		if ((x + rectwidth) >= width || (x) <= 0) {
			xs *= -1;
			
		}
		if ((y + rectheight) >= height || (y) <= 0) {
			ys *= -1;
			
		}
		
		this.repaint();
	}

}
