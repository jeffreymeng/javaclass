/*
 * Programmer: Jeffrey Meng
 * Date: Jan 25, 2018
 * Purpose:
 */

package bankAccount;

public class Customer {
	String name;
	int id;
	int yearsOfService;
	public Customer() {
		//this is bad, we want them to use the other constructor.
		name = "UNKNOWN";
		id = -1;
		yearsOfService = 0;
	}
	public Customer(String name, int id, int yearsOfService) {
		this.yearsOfService = yearsOfService;
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public int getYearsOfService() {
		return yearsOfService;
	}
	public void setYearsOfService(int yearsOfService) {
		this.yearsOfService = yearsOfService;
	}
	public void incrementYearsOfService(int incrementAmt) {
		yearsOfService = yearsOfService + incrementAmt;
	}
}
