/*
  * Programmer: Jeffrey Meng
 * Date: Feb 26, 2018
 * Purpose:
 */

package image;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


@SuppressWarnings("serial")
public class BackgroundPanel extends JPanel implements ActionListener,
		KeyListener, forms.AnimationPanel {
	static JFrame frame;
	private Image img;
	private int imgWidth;
	private int imgHeight;
	int x = 0;
	int y = 0;
	double dy = 1;// speed
	double dx = 1;
	boolean paused;

	public BackgroundPanel() {
		ImageIcon i = new ImageIcon("src/background.jpg");
		img = i.getImage();
		imgWidth = img.getWidth(null);
		imgHeight = img.getHeight(null);

	}
	public BackgroundPanel(JFrame frame) {
		ImageIcon i = new ImageIcon("src/background.jpg");
		img = i.getImage();
		imgWidth = img.getWidth(null);
		imgHeight = img.getHeight(null);
		//this.frame = frame;

	}

	public int getWidth() {
		return imgWidth;
	}

	public int getHeight() {
		return imgHeight;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(img, x, y, null);
		g2d.drawImage(img, x - imgWidth, y, null);
	}

	public void setupWindow(BackgroundPanel panel) {
		frame.setSize(panel.getWidth(), panel.getHeight());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setResizable(false);
		frame.addKeyListener(this);
		frame.setVisible(true);
		start();
	}

	public static void main(String[] args) {
		frame = new JFrame("Background");
		BackgroundPanel panel = new BackgroundPanel();
		panel.setupWindow(panel);
	}

	public void start() {
		Timer t = new Timer(5, this);
		t.start();
	}

	public void actionPerformed(ActionEvent e) {
		if (!paused) {
			x += (int) dx;
			// y += (int) dy;
			
		}
		if (dx > 0) {
			if (x >= imgWidth) {
				x = x - imgWidth;
			}

			if (y >= imgWidth) {
				y = y - imgWidth;
			}
			
		} else if (dx < 0) {
			if (x <= 0) {
				x = 0;
			}

			if (y <= 0) { 
				y = imgHeight;   
				
			}
		}

		this.repaint();
	}

	public void keyPressed(KeyEvent e) {
		// char keyChar = e.getKeyChar();
		int keyCode = e.getKeyCode();
		// System.out.println(keyChar);
		System.out.println(keyCode);
		switch (keyCode) {
		case KeyEvent.VK_LEFT:// left arrow.
			if (dx > 0) {// If delta x is positive, make it negative.
				dx = -dx;
				//BUG: when switching directions the image dissappears. Likely related to actionPeformed method.
			}
			break;
		case KeyEvent.VK_RIGHT:// right arrow.
			if (dx < 0) {// If delta x is negative, make it positive.
				dx = -dx;
			}
			break;
		case KeyEvent.VK_UP:// up arrow.
			if (dx >= 0) {
				dx += 1;// this should always be more than zero, but it may be
						// necessary to add a upper limit in the future.

			}
			break;
		case KeyEvent.VK_DOWN:// down arrow.
			if (dx >= 0) {
				dx -= 1;
			}
			break;
		case KeyEvent.VK_SPACE:// space key.

			paused = !paused;
			// instead of setting speed to zero, we do this so we can store last
			// settings.
			break;
		}

	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
