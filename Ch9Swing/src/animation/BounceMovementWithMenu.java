/*
 * Programmer: Jeffrey Meng
 * Date: Feb 28, 2018
 * Purpose:
 */

package animation;

import graphics.GraphicsPanel;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class BounceMovementWithMenu extends JPanel implements ActionListener {
	int x = 100;
	int y = 100;
	double ys = 1;// speed
	double xs = 1;
	int rectwidth = 50;
	int rectheight = 50;
	int width = 600;
	int height = 400;
	Timer t;

	JMenuBar menubar;
	JMenu fileMenu;
	JMenu blockMenu;
	JMenuItem exitItem;
	JMenuItem startItem;
	JMenuItem stopItem;

	JFrame frame;

	public static void main(String[] args) {
		BounceMovementWithMenu panel = new BounceMovementWithMenu();
		
		panel.setupWindow(panel);
		panel.Test();
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		graphics.setColor(new Color(153, 204, 255));
		graphics.fillRect(x, y, rectwidth, rectheight);

	}

	public void setupWindow(BounceMovementWithMenu panel) {
		// https://stackoverflow.com/questions/8955638/how-do-i-move-my-jmenubar-to-the-screen-menu-bar-on-mac-os-x
		System.setProperty("apple.laf.useScreenMenuBar", "true");
        System.setProperty(
            "com.apple.mrj.application.apple.menu.about.name", "Name");
        frame = new JFrame("Main Frame");
		menubar = new JMenuBar();
		fileMenu = new JMenu("File");
		blockMenu = new JMenu("Block");

		exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(this);
		
		startItem = new JMenuItem("Start");
		startItem.addActionListener(this);
		
		stopItem = new JMenuItem("Stop");
		stopItem.addActionListener(this);

		fileMenu.add(exitItem);
		blockMenu.add(startItem);
		blockMenu.add(stopItem);
		
		menubar.add(blockMenu);
		menubar.add(fileMenu);

		frame.setJMenuBar(menubar);
		
		
		
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		

		frame.setVisible(true);
		width = frame.getContentPane().getWidth();//not really needed, this should be the same as the frame width.
		height = frame.getContentPane().getHeight();//the content pane is the height minus the top title bar.

	}

	public void Test() {
		t = new Timer(10, this);
		t.start();
	}

	public void actionPerformed(ActionEvent e) {
		//System.out.println(e);
		if (e.getSource() == t) {
			x += (int) xs;
			y += (int) ys;

			if ((x + rectwidth) >= width || (x) <= 0) {
				xs *= -1;

			}
			if ((y + rectheight) >= height || (y) <= 0) {
				ys *= -1;

			}

			frame.repaint();
		} else if (e.getSource() == exitItem) {
			//exit
		} else if (e.getSource() == startItem) {
			t.start();
		} else if (e.getSource() == stopItem) {
			t.stop();
		}

	}

}
