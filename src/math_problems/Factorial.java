package math_problems;

public class Factorial {

    /**
     * INSTRUCTIONS
     * <p>
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     * <p>
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static int factorial(int x) {

        // exit criteria for recursion
        if (x <= 1) {
            return x;
        }
        // recursion criteria
        else {

            System.out.println(x);
            return x * factorial(x-1);

        }
    }

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println("Factorial of 6! is " + result);

    }

}

