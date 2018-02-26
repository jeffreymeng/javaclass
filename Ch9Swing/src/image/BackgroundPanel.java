/*
 * Programmer: Jeffrey Meng
 * Date: Feb 26, 2018
 * Purpose:
 */

package image;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BackgroundPanel extends JPanel implements ActionListener{
	static JFrame frame;
	private Image img;
	private int imgWidth;
	private int imgHeight;
	int x = 0;
	int y = 0;
	double ys = 1;// speed
	double xs = 1;
	
	private BackgroundPanel() {
		ImageIcon i = new ImageIcon("src/background.jpg");
		img = i.getImage();
		imgWidth = img.getWidth(null);
		imgHeight = img.getHeight(null);
		
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
		g2d.drawImage(img,  x,  y,  null);
		g2d.drawImage(img,  x - imgWidth,  y,  null);
	}
	
	public void setupWindow(BackgroundPanel  panel) {
		frame.setSize(panel.getWidth(), panel.getHeight());
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setResizable(false);
		frame.setVisible(true);
		startTimer();
	}
	public static void main(String[] args) {
		frame = new JFrame("Background");
		BackgroundPanel panel = new BackgroundPanel();
		panel.setupWindow(panel);
	}
	public void startTimer() {
		Timer t = new Timer(5, this);
		t.start();
	}
	public void actionPerformed(ActionEvent e) {
		x += (int) xs;
		//y += (int) ys;
		if (x >= imgWidth) {
			x = x - imgWidth;
		}
		
		if (y >= imgWidth) {
			y = y - imgWidth;
		}
		
		frame.repaint();
	}
	
	
	
}
