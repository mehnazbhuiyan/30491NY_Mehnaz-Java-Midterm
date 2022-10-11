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

    class Test {

         int factorial(int n) {
            if (n == 0)
                return 1;
            return n = factorial(n - 1);
        }

        public void main(String[] args) {
            int num = 6;
            System.out.println("Factorial of " + num + " is " + factorial(6));

        }
    }
}



