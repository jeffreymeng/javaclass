/*
 * Programmer: Jeffrey Meng
 * Date: Mar 15, 2018
 * Purpose:
 */

package forms;

import java.awt.*;
import javax.swing.Icon;

//based on https://coderanch.com/t/456966/java/give-color-JRadioButtons
class RoundIcon implements Icon {
	Color color;

	public RoundIcon(Color c) {
		color = c;
	}

	public void paintIcon(Component c, Graphics g, int x, int y) {
		g.setColor(color);
		g.fillOval(x, y, getIconWidth(), getIconHeight());
		
	}

	public int getIconWidth() {
		return 10;
	}

	public int getIconHeight() {
		return 10;
	}
}