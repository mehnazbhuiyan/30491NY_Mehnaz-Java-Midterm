package string_problems;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    public static Set<String> getPermutation(String str) {

        //create a set to prevent duplicate permutation
        Set<String> permutations = new HashSet<String>();

        //check if String is null
        if (str == null) {
            return null;
        } else if (str.length() == 0) {
            //terminating condition for recursion
            permutations.add("");
            return permutations;
        }
        //get the first character
        char first = str.charAt(0);

        //get the remaining string
        String sub = str.substring(1);

        //make recursive call to getPermutation
        Set<String> words = getPermutation(sub);

        //access each element from words
        for (String strNew : words) {
            for (int i = 0; i <= strNew.length(); i++) {

                // insert the permutations to the set
                permutations.add(strNew.substring(0,i) + first + strNew.substring(i));
            }
        } return permutations;

    }
}


public class Permutation {

    /** INSTRUCTIONS
     * Create a Java program to compute all permutations of any given string
     *
     * e.g. -  "ABC" = "ABC" "ACB" "BAC" "BCA" "CAB" "CBA"
     */

    public static void main(String[] args) {
        // create an object for the scanner class
    Scanner input = new Scanner(System.in);
        // take input from users
        System.out.print("Enter the String: ");
        String data = input.nextLine();
        System.out.println("Permutations of " + data + ": \n" + Main.getPermutation(data));

    }
    // Implement Here
}
