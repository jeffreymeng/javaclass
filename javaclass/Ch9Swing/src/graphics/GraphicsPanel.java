/*
 * Programmer: Jeffrey Meng
 * Date: Feb 6, 2018
 * Purpose:
 */

package graphics;

import java.awt.*;

import javax.swing.*;


@SuppressWarnings("serial")
public class GraphicsPanel extends JPanel{
	final int width = 800;
	final int height = 600;
	JFrame frame = new JFrame("Main Frame");
	public void paintComponent(Graphics graphics) {
		int width = frame.getWidth();
		int height = frame.getHeight();
		super.paintComponent(graphics);
		
		graphics.setColor(new Color(153, 204, 255));
		graphics.fillRect(0, 0, width, height);
		
		graphics.setColor(new Color(222, 184, 135));
		/*Draw a brown rectangle flush to the bottom of the panel*/
		graphics.fillRect(0, (int) (height * 0.85), width, height);
		
		graphics.setColor(Color.RED);
		
		
		
		graphics.setColor(Color.ORANGE);
		graphics.fillOval(30, 30,  (int) (((width + height) / 2) * 0.15), (int) (((width + height) / 2) * 0.15));
		
		graphics.setColor(Color.GREEN);
		graphics.fillRect(450, 400, 100, 500);
		graphics.setColor(Color.RED);
		Polygon triangle = new Polygon();
		triangle.addPoint(400, 400);
		triangle.addPoint(600, 400);
		triangle.addPoint(500, 300);
		graphics.fillPolygon(triangle);
		
		
	}
	
	public void setupWindow(GraphicsPanel panel) {
		
		
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		GraphicsPanel panel = new GraphicsPanel();
		panel.setupWindow(panel);
		

	}

}
