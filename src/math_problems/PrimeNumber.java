package math_problems;

public class PrimeNumber {

    /** INSTRUCTIONS
     * Write a method to print a list of all prime numbers from 2 to 1,000,000.
     *  Print out the prime numbers in the given range.
     *
     * BONUS: Figure out how to improve algorithmic efficiency
     */


    public static void main(String[] args) {
        int i = 0;
        int num = 0;
                // empty string
        String primeNumbers = "";

        for (i = 2; i <= 1000000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num --) {
                if (i % num == 0) {
                    counter = counter +1;
                }
            }
            if (counter == 2) {
                // appended prime number to the string
                primeNumbers = primeNumbers + i + " ";

            }
        }
        System.out.println("Prime numbers from 2 to 1,000,000 are: ");
        System.out.println(primeNumbers);
    }

}
