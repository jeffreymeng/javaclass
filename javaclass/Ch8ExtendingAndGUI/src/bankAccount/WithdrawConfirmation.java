/*
 * Programmer: Jeffrey Meng
 * Date: Jan 31, 2018
 * Purpose:
 */

package bankAccount;

public class WithdrawConfirmation extends utils.ValueChangeConfirmation<Double> {
	 	String action;
		public WithdrawConfirmation() {
			super();
			
		}
		public WithdrawConfirmation(boolean success, Customer owner, double currentValue, double oldValue, double requestedValue) {
			super(success, "double", currentValue, oldValue, requestedValue);
		}
		public WithdrawConfirmation(boolean success, String errorCode, String errorMessage, int errorId, Customer owner,
				double currentValue, double oldValue, double requestedValue) {
			super(success, errorCode, errorMessage, errorId, "double", currentValue, oldValue, requestedValue);
		}
		
		public void action() {
			
		}
}
