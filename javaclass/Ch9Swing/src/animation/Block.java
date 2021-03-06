/*
 * Programmer: Jeffrey Meng
 * Date: Feb 15, 2018
 * Purpose:
 */

package animation;

import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.Timer;

public class Block implements ActionListener {
	int windowWidth, windowHeight, speed, rectWidth, rectHeight;
	int x, y;
	double dx = 1, dy = 1;
	JFrame frame = null;
	Timer timer;
	//TODO: change to array list
	Block[] watching = new Block[100];
	int numWatching;
	public Block() {
		this.windowWidth = 600;
		this.windowHeight = 400;
		this.speed = 30;
		this.rectWidth = 50;
		this.rectHeight = 50;
		this.frame = null;//will not work until you call setFrame()
		this.x = 0;
		this.y = 0;

	}

	public Block(int speed, JFrame frame, int rectWidth, int rectHeight) {

		this.speed = speed;
		this.rectWidth = rectWidth;
		this.rectHeight = rectHeight;
		
		this.frame = frame;
		this.windowWidth = frame.getContentPane().getWidth();
		this.windowHeight = frame.getContentPane().getHeight();
		this.x = 0;
		this.y = 0;

	}
	public Block(int speed, JFrame frame, int rectWidth, int rectHeight, int startX, int startY) {

		this.speed = speed;
		this.rectWidth = rectWidth;
		this.rectHeight = rectHeight;
		this.frame = frame;
		this.x = startX;
		this.y = startY;

	}
	public void start() {
		timer = new Timer(speed, this);
		timer.start();
	}

	public void stop() {
		timer.stop();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	public int getWidth() {
		return rectWidth;
	}
	
	public int getHeight() {
		return rectHeight;
	}
	
	public void setWidth(int width) {
		rectWidth = width;
	}
	
	public void setHeight(int height) {
		rectHeight = height;
	}
	
	public double getDeltaX() {
		return dx;
	}

	public double getDeltaY() {
		return dy;
	}
	public void setXspeed(double speed) {
		dx = speed;
	}
	public void setYspeed(double speed) {
		dy = speed;
	}
	
	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	public JFrame getFrame() {
		return frame;
	}
	public void restart() {
		timer.restart();
		x = 0; y = 0;
	}
	public void restart(int x, int y) {
		timer.restart();
		this.x = x;
		this.y = y;
	}
	public void detect(Block block) {
		this.watching[numWatching] = block;
		//num watching starts counting at 1, so the numWatching will be the index of the first open slot.
		this.numWatching ++;
	}
	
	public void actionPerformed(ActionEvent e) {
		x += (int) dx;
		y += (int) dy;
		int width, height;
		if (frame == null) {
			 width = 600;
			 height = 400;
		} else {
			 width = frame.getContentPane().getWidth();
			 height = frame.getContentPane().getHeight();
		}
		if ((x + rectWidth) >= width || (x) <= 0) {
			dx *= -1;

		}
		if ((y + rectHeight) >= height || (y) <= 0) {
			dy *= -1;

		}
		
//		for (int i = 0; i < numWatching; i ++) {
//			//logic for x
//			/*
//			 * 
//			 * 
//			 * 
//			 */
//			//TODO: finish
//			if ((x + rectWidth) >= watching[i].getX() || (x) <= 0) {
//				dx *= -1;
//
//			}
//			if ((y + rectHeight) >= watching[i].getY() || (y) <= 0) {
//				dy *= -1;
//
//			}
//		}
		System.out.println(x);
		
		if (frame != null) {
			frame.repaint();
		}

	}

}
