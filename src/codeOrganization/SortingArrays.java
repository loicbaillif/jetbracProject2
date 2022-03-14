package codeOrganization;

/* ****** Code Organization - Exercise : Sorting Arrays ******
 * 
 * The class Arrays provides a number of useful methods for processing arrays. 
 * Among them, there's a commonly used one called sort. It allows you to sort 
 * any array (string array, integer array, or even object array ). It accepts 
 * one argument: the array itself. It modifies the array, returning nothing.
 * 
 * In this task, you need to call this method from the Arrays class 
 * without using an import statement.
 * 
 */

public class SortingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = {"y", "d", "b", "u", "t", "f", "m", "h", "x", "q"};
		sortArray(test);
		System.out.println(java.util.Arrays.toString(test));
	}
	
	public static String[] sortArray(String[] array) {
        // write your code here
		java.util.Arrays.sort(array);
		return array;
    }

}
