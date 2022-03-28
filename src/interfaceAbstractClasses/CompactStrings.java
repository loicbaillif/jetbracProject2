package interfaceAbstractClasses;

/* ****** INTERFACE - Exercise : Compact Strings ******
 * 
 * Strings in Java implement java.lang.CharSequence interface. Since Java 
 * internally uses UTF-16, 2 bytes are required to store each char. 
 * At the same time, ASCII encoding allows storing character codes in one 
 * byte and includes all Latin letters, digits, and standard special 
 * characters. Compared to the standard String class, ASCII-character 
 * sequences require half the memory.
 * 
 * Write a class named CompactStrings for storing ASCII-character 
 * sequences, that should:
 * 
 * 		- implement the interface java.lang.CharSequence;
 * 		- have a constructor that takes a byte array;
 * 		- have methods int length(), char charAt(int idx), CharSequence 
 * 		subSequence(int from, int to), and String toString().
 * 	
 * You can find the declaration of methods and their behaviour in the 
 * description of java.lang.CharSequence (JavaDoc or sources).
 * 
 * Carefully check signatures of abstract methods of java.lang.CharSequence 
 * interface, especially subSequence method. It accepts 2 integers: 
 * start index (inclusive) and end index (exclusive). The method returns an 
 * object of a class that implements java.lang.CharSequence interface. 
 * In this example it will be an instance of AsciiCharSequence class.
 */

import java.util.*;

class CompactStrings implements java.lang.CharSequence {

	byte[] compactStringArray;

	public CompactStrings(byte[] charSequence) {
		this.compactStringArray = charSequence.clone();
	}


	@Override
	public int length() {
		if (!Objects.equals(compactStringArray, null)) {
			return compactStringArray.length;
		}
		return 0;
	}

	@Override
	public char charAt(int index) {
		if (compactStringArray.length > index) {
			return (char) compactStringArray[index];
		}
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String toString() {
		// TODO 
		return "";
	}


}
