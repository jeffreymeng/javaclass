/*
 * Programmer: Jeffrey Meng
 * Date: Feb 15, 2018
 * Purpose:
 */

package animation;


import java.awt.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class BlockMovementPanel extends JPanel  {

	int rectwidth = 50;
	int rectheight = 50;
	int width = 600;
	int height = 400;
	
	JFrame frame = new JFrame("Main Frame");
	Block block1, block2;
	
	public static void main(String[] args) {
		BlockMovementPanel panel = new BlockMovementPanel();
		panel.setupWindow(panel);
		
		
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		graphics.setColor(new Color(153, 204, 255));
		graphics.fillRect(block1.getX(), block1.getY(), rectwidth, rectheight);
		graphics.fillRect(block2.getX(), block2.getY(), rectwidth, rectheight);

	}

	public void setupWindow(BlockMovementPanel panel) { 
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		block1 = new Block(30, frame, rectwidth, rectheight, 50, 200);
		block2 = new Block(30, frame, rectwidth, rectheight, 450, 200);
		block1.detect(block2);
		block2.detect(block1);
		//Frames per second. The higher the faster.
		
		frame.setVisible(true);
		
		block1.start();
		block2.start();

	}

	

}
