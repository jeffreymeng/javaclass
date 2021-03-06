/*
 * Programmer: Jeffrey Meng
 * Date: Nov 27, 2017
 * Purpose:
 */

package substitution;

import java.util.Scanner;

public class SubstitutionCipher {
	// key is a integer that shows how many characters to shift the message.
	public static void main(String[] args){
		String type;
		Scanner in = new Scanner(System.in);
		String message;
		int key;
		
		System.out.println("Do you want to Encrypt of Decrypt");
		type = in.nextLine().toLowerCase();
		while (!type.equals("encrypt")  && type.equals("decrypt")) {
			System.out.println("Enter Encrypt or Decrypt");
			type = in.nextLine().toLowerCase();
		}
		if (type.equals("encrypt") ) {
			System.out.println("Encrypt Mode");
			System.out.println("Enter a message:");
			message = in.nextLine();
			System.out.println("Enter a key:");
			key = in.nextInt();
			while (key > 93) {
				System.out.println("Enter a integer less than 93:");
				key = in.nextInt();
			}
			System.out.println("Encrypted Message:");
			System.out.println(encrypt(key, message));
			
		}else {
			System.out.println("Decrypt Mode");
			System.out.println("Enter a message:");
			message = in.nextLine();
			System.out.println("Enter a key:");
			key = in.nextInt();
			while (key > 93) {
				System.out.println("Enter a integer less than 93:");
				key = in.nextInt();
			}
			System.out.println("Decrypted Message:");
			System.out.println(decrypt(key, message));
			
		}
		in.close();
	}
	public static String encrypt(int key, String message) {//charKey is the key as a char, which will be converted to an integer.
		
		char[] result = new char[message.length()];//create an character array with the length of the message.
		int ascii;//ASCII value of the char. For use inside the loop below
		
		//loop through each character within the message
		for (int i = 0; i < message.length(); i++) {
			ascii = (int) message.charAt(i);//ASCII representation of the char
			
			result[i] += (char) ascii + key;//shift the character.
			
			//if the result is greater than the last ASCII character supported(#126 which is ~), we loop around.
			if (result[i] > 126) {
				result[i] = (char)((int) result[i] - 93);//the span of the characters supported.
			}
			
		}
		
		return String.valueOf(result);//this builds the char array into a result.

	}

public static String decrypt(int key, String message) {//charKey is the key as a char, which will be converted to an integer.
		
		char[] result = new char[message.length()];//create an character array with the length of the message.
		int ascii;//ASCII value of the char. For use inside the loop below
		
		//loop through each character within the message
		for (int i = 0; i < message.length(); i++) {
			ascii = (int) message.charAt(i);//ASCII representation of the char
			
			result[i] += (char) ascii - key;//shift the character back.
			
			//un-loop around.
			if (result[i] < 32) {
				result[i] = (char)((int) result[i] + 93);//the span of the characters supported.
			}
			
		}
		
		return String.valueOf(result);//this builds the char array into a result.

	}
}
