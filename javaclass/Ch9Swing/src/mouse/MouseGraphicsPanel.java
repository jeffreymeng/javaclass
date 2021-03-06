/*
 * Programmer: Jeffrey Meng
 * Date: Feb 8, 2018
 * Purpose:
 */

package mouse;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MouseGraphicsPanel extends JPanel implements MouseListener {
	public JFrame frame = new JFrame("Mouse Panel");
	public static MouseGraphicsPanel panel;
	// Blue: #0000ff
	// Blue Outline: A dark blue border - #0000B3
	// Blue Dark: A slightly darker blue - #000080
	final public Color BLUE = new Color(0, 0, 255);
	final public Color BLUE_DARK = new Color(0, 0, 230);
	final public Color BLUE_OUTLINE = new Color(0, 0, 179);
	// Red: #ff0000
	// Red Outline: A dark red border - #B30000
	// Red Dark: A slightly darker red - #800000
	final public Color RED = new Color(255, 0, 0);
	final public Color RED_DARK = new Color(230, 0, 0);
	final public Color RED_OUTLINE = new Color(179, 0, 0);
	
	int[] rect1 = new int[4], rect2 = new int[4];
	Color rect1Color = RED, rect2Color = BLUE;
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

		graphics.setColor(RED_OUTLINE);
		graphics.drawRect(rect1[0] - 1, rect1[1] - 1, rect1[2] + 1, rect1[3] + 1);
		graphics.setColor(rect1Color);
		graphics.fillRect(rect1[0], rect1[1], rect1[2], rect1[3]);
		
		graphics.setColor(BLUE_OUTLINE);
		graphics.drawRect(rect2[0] - 1, rect2[1] - 1, rect2[2] + 1, rect2[3] + 1);
		graphics.setColor(rect2Color);
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
		// System.out.println("Mouse clicked");
		if ((e.getX() > rect1[0] && e.getX() < (rect1[0] + rect1[2]))
				&& (e.getY() > rect1[1] && e.getY() < (rect1[1] + rect1[3]))) {
			System.out.println("Rectangle 1 Clicked");
		} else if ((e.getX() > rect2[0] && e.getX() < (rect2[0] + rect2[2]))
				&& (e.getY() > rect2[1] && e.getY() < (rect2[1] + rect2[3]))) {
			System.out.println("Rectangle 2 Clicked");
		}
	}

	public void mousePressed(MouseEvent e) {
		// System.out.println("Mouse pressed");
		if ((e.getX() > rect1[0] && e.getX() < (rect1[0] + rect1[2]))
				&& (e.getY() > rect1[1] && e.getY() < (rect1[1] + rect1[3]))) {
			System.out.println("Rectangle 1 Pressed");
			rect1Color = RED_DARK;
			panel.repaint();
		} else if ((e.getX() > rect2[0] && e.getX() < (rect2[0] + rect2[2]))
				&& (e.getY() > rect2[1] && e.getY() < (rect2[1] + rect2[3]))) {
			System.out.println("Rectangle 2 Pressed");
			rect2Color = BLUE_DARK;
			panel.repaint();
		}

	}

	public void mouseReleased(MouseEvent e) {
		rect1Color = RED;
		rect2Color = BLUE;
		panel.repaint();
		// System.out.println("Mouse released");
		/*if ((e.getX() > rect1[0] && e.getX() < (rect1[0] + rect1[2]))
				&& (e.getY() > rect1[1] && e.getY() < (rect1[1] + rect1[3]))) {
			System.out.println("Rectangle 1 Released");
			
		} else if ((e.getX() > rect2[0] && e.getX() < (rect2[0] + rect2[2]))
				&& (e.getY() > rect2[1] && e.getY() < (rect2[1] + rect2[3]))) {
			System.out.println("Rectangle 2 Released");
		}
		*/

	}

	public void mouseEntered(MouseEvent e) {
		// System.out.println("Mouse entered");

	}

	public void mouseExited(MouseEvent e) {
		// System.out.println("Mouse exited");

	}

}
