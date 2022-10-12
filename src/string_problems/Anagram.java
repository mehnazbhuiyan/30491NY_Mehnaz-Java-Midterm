package string_problems;
import java.util.Arrays;

public class Anagram {

    /** INSTRUCTIONS
     * Write a Java Program, `isAnagram`, to check if any two strings are anagrams
     *
     *  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all of the
     *  original letters exactly once.
     *
     *         Ex: "CAT" & "ACT",
     *             "ARMY" & "MARY",
     *             "FART" & "RAFT"
     */

    // Implement Here
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // check if the two strings have equal length
        if (str1.length() == str2.length()) {

            // if this is true, convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are the same,
            // then the two strings are anagram

            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram");
            }
        }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram ");
            }
        }
    }

