/*
 * Programmer: Jeffrey Meng
 * Date: Jan 10, 2018
 * Purpose:
 */

package box;

public class Box {
	private int height, width, length;
	private String name, units;
	
	public Box(int length, int width, int height, String units, String name) {
		this.length = length;
		this.height = height;
		this.width = width;
		this.units = units;
		this.name = name;
	}

	public Box() {
		length = 1;
		height = 1;
		width = 1;
		units = "ft";
		name = "myBox";
	}
	
	public int volume() {
		//Not going to return unit because it becomes harder to manipulate the number if you have 
		//to extract it from a string. Instead, add a method to get the units.
		return (length * height * width);
	}
	public int surfaceArea() {
		//also not going to return units.
		return 2 * (length * height + height * width + length * width);
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public int getLength() {
		return length;
	}
	public String getName() {
		return name;
	}
	public String getUnits() {
		return units;
	}
	public void rename(String name) {
		this.name = name;
	}
	
}
