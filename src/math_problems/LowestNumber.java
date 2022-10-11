package math_problems;

public class LowestNumber {

    /** INSTRUCTIONS
     * Write a method to find the lowest number from this array.
     */

    public static void main(String[] args) {

        int[] array = new int[] {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123,
                67, 5, 679, 54, 32, 65};
        System.out.println("Given array");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        // initialize minValue with first element of array
        int minValue = array[0];
        // loop thru the array
        for (int i = 0; i < array.length; i++) {

            // compare elements of array with minValue and
            // if condition is true, make minValue that element
            if (array[i] < minValue)
                minValue = array[i];

        }
        System.out.println("Smallest element present in given array: " + minValue);
    }

}
