/*
 * Programmer: Jeffrey Meng
 * Date: Mar 13, 2018
 * Purpose:
 */

package layouts;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CardLayoutBasic implements ActionListener {
	final int numCards = 3;
	JFrame frame;
	JPanel cardParentPanel, controlPanel, titlePanel;
	JLabel titleLabel;
	JPanel[] cards = new JPanel[numCards];
	JLabel[] labels = new JLabel[numCards];
	JButton[] buttons = new JButton[numCards];

	
	public void actionPerformed(ActionEvent e) {
		// not efficient
		// some way to search would be more efficient
		// extracting the id from the event would be even better

		for (int i = 0; i < buttons.length; i++) {
			if (e.getSource() == buttons[i]) {
				System.out.println("Button " + (i + 1) + " clicked.");
				CardLayout layout = (CardLayout) (cardParentPanel.getLayout());
				layout.show(cardParentPanel, "card" + i);
				break;
			}
		}
	}

	public void setupWindow() {
		frame = new JFrame("Enter the pin");

		frame.setLayout(new GridLayout(3, 1));

		titlePanel = new JPanel();
		titlePanel.setLayout(new FlowLayout());

		titleLabel = new JLabel("Control Center");
		titlePanel.add(titleLabel, JLabel.CENTER);

		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());

		cardParentPanel = new JPanel();
		cardParentPanel.setLayout(new CardLayout());

		for (int i = 0; i < cards.length; i++) {
			cards[i] = new JPanel();
			cardParentPanel.add(cards[i], "card" + i);
			labels[i] = new JLabel("Card " + (i + 1));
			cards[i].add(labels[i], JLabel.CENTER);
			cardParentPanel.add(cards[i]);

			buttons[i] = new JButton("Switch to card " + (i + 1));
			
			buttons[i].addActionListener(this);
			controlPanel.add(buttons[i]);

		}

		frame.add(titlePanel);
		frame.add(controlPanel);
		frame.add(cardParentPanel);

		frame.setTitle("Basic Card Layout");
		frame.setSize(500, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	public static void main(String[] args) {
		CardLayoutBasic window = new CardLayoutBasic();
		window.setupWindow();
	}

}
