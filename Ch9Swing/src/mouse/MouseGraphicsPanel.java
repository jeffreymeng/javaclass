/*
 * Programmer: Jeffrey Meng
 * Date: Feb 8, 2018
 * Purpose:
 */

package mouse;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class MouseGraphicsPanel extends JPanel implements MouseListener {
	public JFrame frame = new JFrame("Mouse Panel");
	public static MouseGraphicsPanel panel;
	int[] rect1 = new int[4], rect2 = new int[4];
	public static void main(String[] args) {
		panel = new MouseGraphicsPanel();
		panel.setupWindow(panel);

	}

	public MouseGraphicsPanel() {
		addMouseListener(this);
	}
	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		
		int width = panel.getWidth();
		int height = panel.getHeight();
		// x, y, width, height
		
		
		rect1[0] = (int) (width * 0.1);
		rect1[1] = (int) (height * 0.25);
		rect1[2] = (int) (width * 0.35);
		rect1[3] = (int) (height * 0.5);
		rect2[0] = (int) (width * 0.55);
		rect2[1] = (int) (height * 0.25);
		rect2[2] = (int) (width * 0.35);
		rect2[3] = (int) (height * 0.5);
		
		
		
		graphics.setColor(new Color(153, 204, 255));
		graphics.fillRect(0, 0, width, height);
		
		graphics.setColor(Color.RED);
		graphics.fillRect(rect1[0], rect1[1], rect1[2], rect1[3]);
		
		graphics.setColor(Color.BLUE);
		graphics.fillRect(rect2[0], rect2[1], rect2[2], rect2[3]);
		
		
		
		
	}

	public void setupWindow(MouseGraphicsPanel panel) {
		
		frame.setSize(600, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {
		//System.out.println("Mouse clicked");
		if ((e.getX() > rect1[0] && e.getX() < (rect1[0] + rect1[2])) && (e.getY() > rect1[1] && e.getY() < (rect1[1] + rect1[3]))) {
			System.out.println("Rectangle 1 Clicked");
		} else if ((e.getX() > rect2[0] && e.getX() < (rect2[0] + rect2[2])) && (e.getY() > rect2[1] && e.getY() < (rect2[1] + rect2[3]))) {
			System.out.println("Rectangle 2 Clicked");
		}
	}

	public void mousePressed(MouseEvent e) {
		//System.out.println("Mouse pressed");
		if ((e.getX() > rect1[0] && e.getX() < (rect1[0] + rect1[2])) && (e.getY() > rect1[1] && e.getY() < (rect1[1] + rect1[3]))) {
			System.out.println("Rectangle 1 Pressed");
		}else if ((e.getX() > rect2[0] && e.getX() < (rect2[0] + rect2[2])) && (e.getY() > rect2[1] && e.getY() < (rect2[1] + rect2[3]))) {
			System.out.println("Rectangle 2 Pressed");
		}

	}

	public void mouseReleased(MouseEvent e) {
		//System.out.println("Mouse released");
		if ((e.getX() > rect1[0] && e.getX() < (rect1[0] + rect1[2])) && (e.getY() > rect1[1] && e.getY() < (rect1[1] + rect1[3]))) {
			System.out.println("Rectangle 1 Released");
		}else if ((e.getX() > rect2[0] && e.getX() < (rect2[0] + rect2[2])) && (e.getY() > rect2[1] && e.getY() < (rect2[1] + rect2[3]))) {
			System.out.println("Rectangle 2 Released");
		}

	}

	public void mouseEntered(MouseEvent e) {
		//System.out.println("Mouse entered");

	}

	public void mouseExited(MouseEvent e) {
		//System.out.println("Mouse exited");

	}

}
