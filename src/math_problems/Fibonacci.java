package math_problems;

public class Fibonacci {

    /** INSTRUCTIONS
     *
     * Write a method that will print or return at least 40 Fibonacci number
     * e.g. - 0,1,1,2,3,5,8,13
     **/

    public static void main(String[] args) {
        getFibonacci(40, 0, 1);
    }
    public static int getFibonacci (int maxNumber, int previousNumber, int nextNumber) {


        System.out.print("Fibonacci Series of " + maxNumber + " numbers: ");


        for (int i = 1; i <= maxNumber; ++i) {
            System.out.print(previousNumber + "," + " ");

            //on each iteration, we are assigning second number
            //to the first number and assigning the sum of the last two
            //numbers to the second number

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;

        }
        return maxNumber;
    }
}
