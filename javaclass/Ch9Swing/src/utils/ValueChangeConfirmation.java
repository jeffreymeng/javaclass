/*
 * Programmer: Jeffrey Meng
 * Date: Jan 22, 2018
 * Purpose:
 */

package utils;

//https://docs.oracle.com/javase/tutorial/java/generics/types.html
public class ValueChangeConfirmation<Type> {
	private boolean success;
	private Type currentValue, requestedValue;
	private Type oldValue;
	private String errorCode, errorMessage, type;
	private int errorId;

	public ValueChangeConfirmation() {
		this.success = true;
		this.errorCode = "Success/success";
		this.errorMessage = "success";
		this.type = "[UNKNOWN]";
		this.errorId = -1;
		this.currentValue = null;
		this.oldValue = null;
		this.requestedValue = null;
		
	}
	public ValueChangeConfirmation(boolean success, String type, Type currentValue, Type oldValue, Type requestedValue) {
		//this is a shortcut for a successful value change(usually)
		this.success = success;
		this.errorCode = "Success/success";
		this.errorMessage = "success";
		this.type = type;
		this.errorId = -1;
		this.currentValue = currentValue;
		this.oldValue = oldValue;
		this.requestedValue = requestedValue;
	}
	public ValueChangeConfirmation(boolean success, String errorCode, String errorMessage, int errorId, String type, Type currentValue, Type oldValue, Type requestedValue) {
		this.success = success;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.type = type;
		this.errorId = errorId;
		this.currentValue = currentValue;
		this.oldValue = oldValue;
		this.requestedValue = requestedValue;
	}
	

	public boolean success() {
		return success;
	}

	public String errorCode() {

		return errorCode;

	}

	public Type currentValue() {
		return currentValue;
	}

	public Type requestedValue() {
		return requestedValue;
	}

	public Type oldValue() {
		return oldValue;
	}

	public String errorMessage() {
		if (success) {
			return "SUCCESS";
		} else {
			return errorMessage;
		}
	}

	public String type() {
		return type;
	}

	public int errorId() {

		return errorId;

	}

}
