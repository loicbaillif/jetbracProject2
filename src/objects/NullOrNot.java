package objects;

import java.util.Objects;

/* ****** Exercise: Null or Not ******
 * Write a method that checks if the object passed to it is null or not. 
 * If it is null, the method must print "It's null" and if not it must 
 * print "It's an object".
 */

import java.util.Scanner;

class Solution {

    public void printIsNull(Object o) {
        // write your code here
    	
    }
}

// Do not change the code below
class NullOrNot {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Object obj = "null".equals(scanner.nextLine()) ? null : new Object();
            solution.printIsNull(obj);
        }
    }
}