/*
 * Programmer: Jeffrey Meng
 * Date: Jan 25, 2018
 * Purpose:
 */

package vehicles;

import java.util.Scanner;

public class VehicleUI {
	public static void main(String[] args) {
		//int type = 0;
		String manufacturer;
		int year, doors,passengers, towingWeight, cargoArea, wheels, originalPrice;
		Truck t;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Truck Maker 2000");

		System.out.print("Enter the manufacturer of your truck: ");
		manufacturer = in.nextLine();
		in.nextLine();
		System.out.println("Enter the year your truck was created: ");
		year = in.nextInt();
		
		System.out.println("Enter the number of doors your truck has: ");
		doors = in.nextInt();
		
		System.out.println("Enter the number of wheels your truck has: ");
		wheels = in.nextInt();
		
		while (wheels != 4 && wheels != 6) {
			System.out.print("Enter either 4 or 6: ");
			wheels = in.nextInt();
		}
		
		System.out.print("Enter the number of passengers your truck can carry: ");
		passengers = in.nextInt();
		
		System.out.println("Enter the towing weight of your truck: ");
		towingWeight = in.nextInt();
		
		System.out.println("Enter the cargo area of your truck: ");
		cargoArea = in.nextInt();
		
		System.out.println("Enter the original price of your truck");
		originalPrice = in.nextInt();
		//System.out.println("Would you like to change any options?");
		//then use switch, menu and change.
		System.out.println("Your truck:");
		t = new Truck(manufacturer, year, doors, passengers, towingWeight, cargoArea, wheels, originalPrice);
		t.displayInfo();
		in.close();
		
		
	}
}
