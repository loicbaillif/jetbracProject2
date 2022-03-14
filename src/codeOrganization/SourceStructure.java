package codeOrganization;

// import java.util.Arrays;

/* ****** Code Organization - Exercise : Source Structure ******
 * 
 * The class Arrays includes a lot of useful methods for processing arrays. 
 * One of them is the binarySearch method. It allows you to quickly find the 
 * index of an element in the given ordered array. You just need to pass the 
 * array of values and the value to search for to this method.
 * 
 * In this quiz, you need to call this method from the Arrays class 
 * without using an import statement.
 */

public class SourceStructure {
	
	/**
     * @param nums ordered sequence of integers
     * @param key  an element for searching
     * @return index of key or a negative value
     */
    public static int callBinarySearch(int[] nums, int key) {
        // write your code here
    	return java.util.Arrays.binarySearch(nums, key);
    }
    
    public static void main(String[] args) {
    	int[] test = {0, 1, 2, 3, 4, 5, 6};
    	System.out.println(callBinarySearch(test, 5));
    }

}
