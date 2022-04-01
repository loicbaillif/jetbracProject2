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

	byte[] compactStringsArray;

	public CompactStrings(byte[] charSequence) {
		this.compactStringsArray = charSequence.clone();
	}


	@Override
	public int length() {
		if (!Objects.equals(compactStringsArray, null)) {
			return compactStringsArray.length;
		}
		return 0;
	}

	@Override
	public char charAt(int index) {
		if (compactStringsArray.length > index) {
			return (char) compactStringsArray[index];
		}
		return 0;
	}

	@Override
	public CompactStrings subSequence(int from, int to) {
		byte[] temp = new byte[to - from];
		for (int i = 0; i < to - from; i++) {
			temp[i] = compactStringsArray[from + i];
		}
		CompactStrings result = new CompactStrings(temp);
		return result;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for (byte letter: compactStringsArray) {
			result.append((char)letter);
		}
		return result.toString();
	}

	
	
	
	public static void main(String[] args) {
		byte[] test1Byte = {33, 88, 57, 123, 42};
		CompactStrings test1 = new CompactStrings(test1Byte);
		System.out.println(test1.charAt(1));
		System.out.println(test1.length());
		System.out.println(test1.toString());
		System.out.println(test1.subSequence(1, 4));
	}

}
