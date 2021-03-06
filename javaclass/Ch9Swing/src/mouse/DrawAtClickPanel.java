/*
 * Programmer: Jeffrey Meng
 * Date: Feb 9, 2018
 * Purpose:
 */

package mouse;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.concurrent.ThreadLocalRandom;

@SuppressWarnings("serial")
public class DrawAtClickPanel extends JPanel implements MouseListener {
	public JFrame frame = new JFrame("Mouse Panel");
	public static DrawAtClickPanel panel;

	// ArrayList<Integer[]> shapes = new ArrayList<Integer[]>();
	// https://www.geeksforgeeks.org/arraylist-in-java/

	int[][] shapes = new int[ /* Integer.MAX_VALUE - 5 */1000000][8];
	int numShapes = 0;

	// each element of the arraylist is a shape
	// second level is [r, g, b, a, x, y, width]
	// hashmap easier. Could also make a shape class.

	static int width;
	static int height;

	public static void main(String[] args) {
		panel = new DrawAtClickPanel();
		panel.setupWindow(panel);
		width = panel.getWidth();
		height = panel.getHeight();

	}

	public DrawAtClickPanel() {
		addMouseListener(this);
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);
		// graphics.setColor(new Color(153, 204, 255));
		// graphics.fillRect(0, 0, width, height);

		// for array list, use shapes.get(i)[0] instead
		for (int i = 0; i < numShapes; i++) {
			graphics.setColor(new Color(shapes[i][0], shapes[i][1],
					shapes[i][2], shapes[i][3]));
			
			int x = shapes[i][4];
			int y = shapes[i][5];
			int size = shapes[i][6];
			
			//add half the size of a side to get the x and y centered
			x = x - (int) ((size)/2.0);
			y = y - (int) ((size)/2.0);
			if (shapes[i][7] == 1) {
				// Shape is a square
				graphics.fillRect(x, y, size, size);
			} else {
				// Shape is a circle
				graphics.fillOval(x, y, size, size);
			}
		}

	}

	public void setupWindow(DrawAtClickPanel panel) {

		frame.setSize(600, 600);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		// frame.setResizable(false);

		frame.setVisible(true);
	}

	public void mouseClicked(MouseEvent e) {

	}

	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {
		
		shapes[numShapes][0] = ThreadLocalRandom.current().nextInt(0, 256);// random
		// number
		// in
		// range(min,
		// max
		// +
		// 1)
		shapes[numShapes][1] = ThreadLocalRandom.current().nextInt(0, 256);
		shapes[numShapes][2] = ThreadLocalRandom.current().nextInt(0, 256);
		shapes[numShapes][3] = ThreadLocalRandom.current().nextInt(5, 256);
		shapes[numShapes][4] = e.getX();
		shapes[numShapes][5] = e.getY();
		shapes[numShapes][6] = ThreadLocalRandom.current().nextInt(20,
				(int) (((height + width) / 2) * 0.25));
		shapes[numShapes][7] = ThreadLocalRandom.current().nextInt(1, 3);

		numShapes++;

		frame.repaint();
		
	}

	public void mouseEntered(MouseEvent e) {
		// System.out.println("Mouse entered");

	}

	public void mouseExited(MouseEvent e) {
		// System.out.println("Mouse exited");
	}

}
