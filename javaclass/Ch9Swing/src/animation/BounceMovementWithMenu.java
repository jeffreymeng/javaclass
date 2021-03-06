/*
 * Programmer: Jeffrey Meng
 * Date: Feb 28, 2018
 * Purpose:
 */

package animation;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class BounceMovementWithMenu extends JPanel implements ActionListener, forms.AnimationPanel {
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
	JMenuItem addBlockItem;
	JMenuItem removeBlockItem;

	JFrame frame;

	Block[] blocks = new Block[4];
	int numBlocks = 0;

	final int ctrlOrCmd = Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask();
	final char SPACE = ' ';//for better readability
	
	public static void main(String[] args) {
		BounceMovementWithMenu panel = new BounceMovementWithMenu();

		panel.setupWindow(panel);
		// panel.Test();
	}

	public void paintComponent(Graphics graphics) {
		super.paintComponent(graphics);

		graphics.setColor(new Color(153, 204, 255));
		for (int i = 0; i < blocks.length; i++) {
			if (blocks[i] != null) {
				graphics.fillOval(blocks[i].getX(), blocks[i].getY(),
						blocks[i].getWidth(), blocks[i].getHeight());
			}
		}

	}

	public void setupWindow(BounceMovementWithMenu panel) {
		// https://stackoverflow.com/questions/8955638/how-do-i-move-my-jmenubar-to-the-screen-menu-bar-on-mac-os-x
		System.setProperty("apple.laf.useScreenMenuBar", "true");
		System.setProperty("com.apple.mrj.application.apple.menu.about.name",
				"Bounce Animation");
		frame = new JFrame("Main Frame");
		menubar = new JMenuBar();
		fileMenu = new JMenu("File");
		blockMenu = new JMenu("Ball");

		exitItem = new JMenuItem("Exit");
		exitItem.addActionListener(this);
		exitItem.setAccelerator(KeyStroke.getKeyStroke('Q', ctrlOrCmd));


		startItem = new JMenuItem("Start");
		startItem.addActionListener(this);
		

		stopItem = new JMenuItem("Stop");
		stopItem.addActionListener(this);
		//stopItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, ctrlOrCmd));
		
		addBlockItem = new JMenuItem("Add Ball");
		addBlockItem.addActionListener(this);
		addBlockItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ctrlOrCmd));
		
		removeBlockItem = new JMenuItem("Remove Ball");
		removeBlockItem.addActionListener(this);
		removeBlockItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, ctrlOrCmd));

		fileMenu.add(exitItem);
		blockMenu.add(startItem);
		blockMenu.add(stopItem);
		blockMenu.addSeparator();
		blockMenu.add(addBlockItem);
		blockMenu.add(removeBlockItem);


		menubar.add(blockMenu);
		menubar.add(fileMenu);

		frame.setJMenuBar(menubar);

		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		blocks[0] = new Block(30, frame, rectwidth, rectheight, 50, 200);
		blocks[1] = new Block(15, frame, rectwidth, rectheight, 200, 50);
		numBlocks = 2;
		
		frame.setVisible(true);
		width = frame.getContentPane().getWidth();// not really needed, this
													// should be the same as the
													// frame width.
		height = frame.getContentPane().getHeight();// the content pane is the
													// height minus the top
													// title bar.

		start();
	}
	public void start() {
		for (int i = 0; i < blocks.length; i++) {
			if (blocks[i] != null) {
				blocks[i].start();
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		// System.out.println(e);
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
			// exit
			System.exit(1);

		} else if (e.getSource() == startItem) {
			for (int i = 0; i < blocks.length; i++) {
				if (blocks[i] != null) {
					blocks[i].start();
				}
			}
		} else if (e.getSource() == stopItem) {
			for (int i = 0; i < blocks.length; i++) {
				if (blocks[i] != null) {
					blocks[i].stop();
				}
			}

		}else if (e.getSource() == addBlockItem) {
			if (numBlocks >= blocks.length) {//this should never happen unless the starting array length 
				//is set to less than or equal to the starting number of balls.
				addBlockItem.setEnabled(false);
				
			} else {
				blocks[numBlocks] = new Block(10, frame, rectwidth, rectheight, 200, 50);
				blocks[numBlocks].start();
				numBlocks ++;
				if (numBlocks >= blocks.length) {
					addBlockItem.setEnabled(false);
				} else {
					addBlockItem.setEnabled(true);
				}
			}

		}else if (e.getSource() == removeBlockItem) {
			if (numBlocks <= 0) {//this should never happen unless the starting array length 
				//is set to less than or equal to the starting number of balls.
				removeBlockItem.setEnabled(false);
				
			} else {
				blocks[numBlocks - 1].stop();
				blocks[numBlocks - 1] = null;
				numBlocks --;
				if (numBlocks <= 0) {
					removeBlockItem.setEnabled(false);
				} else {
					removeBlockItem.setEnabled(true);
				}
			}

		}
		

	}

}
