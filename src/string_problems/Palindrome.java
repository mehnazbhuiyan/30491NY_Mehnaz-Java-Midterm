package string_problems;
import java.util.Scanner;
public class Palindrome {

    /** INSTRUCTIONS
     * A palindrome is a word that can be reversed, and still remain the same.
     *
     * Example: MOM, DAD, MADAM, RACECAR
     *
     * Create a method to check if any given String is a palindrome or not.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check whether or not it is a palindrome");
        String input = scanner.nextLine();

        // check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome string");
        } else {
            System.out.println(input + " is not a palindrome string");
        }
    }

    private static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right --;
        }
        return true;

    }

    // Implement here


}
