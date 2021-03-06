

/*
 * Programmer: Jeffrey Meng
 * Date: Feb 1, 2018
 * Purpose: Basic swing window.
 */

package basicSwing;

import javax.swing.*;
import java.util.Scanner;

public class ChangeableTitle {
	public static void main(String[] args) {
		ChangeableTitle w = new ChangeableTitle();
		w.setupWindow();
	}

	public void setupWindow() {
		Scanner in = new Scanner(System.in);
		String[] size;
		
		JFrame f = new JFrame("First");
		f.setTitle("First Window!");
		f.setSize(300, 200);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
		System.out.println("Enter a new title: ");
		f.setTitle(in.nextLine());
		System.out.println("Enter a new sixe(ex. 400x500): ");
		//parse the dimensions
		size = in.nextLine().split("x");
		f.setSize(Integer.parseInt(size[0]), Integer.parseInt(size[1]));
		//center it again
		f.setLocationRelativeTo(null);
		
		in.close();
	}
}
