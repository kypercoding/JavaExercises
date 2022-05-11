package solutions;

import interfaces.Mathematics;

public class MathematicsSolution implements Mathematics {
    /**
     * Given an integer n, print the nth number in the
     * Fibonnaci sequence.
     * @param n
     * @return nth number of Fibonnaci sequence.
     */
    public int fibonnaci(int n) {
        // if n happens to be 0 or 1,
        // go back up recursive stack.
        if (n <= 1) {
            return n;
        }

        // Fn = Fn-1 + Fn-2
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }

    /**
     * Given an integer n, print n! (factorial of n).
     * @param n
     * @return n!
     */
    public int factorial(int n) {
        if (n <= 1) {
            return n;
        }

        return n * factorial(n - 1);
    }

    /**
     * Calculate the Euclidean distance between
     * two points (x1, y1) and (x2, y2).
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return distance between points.
     */
    public double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    /**
     * Given a set of numbers, calculate the arithmetic
     * mean (average) of the numbers.
     * @param numbers
     * @return mean of int[] numbers
     */
    public double mean(int[] numbers) {
        // sum object
        int sum = 0;

        // adds all numbers
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // returns division of sum by number of numbers
        return (double) sum / numbers.length;
    }

    /**
     * Given a set of numbers, return the maximum
     * integer.
     * @param numbers
     * @return the maximum number.
     */
    public int max(int[] numbers) {
        // minimum value is starting maximum
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            // if a number higher than the current
            // maximum has been found, then set that
            // number as the new maximum
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    /**
     * Given a set of numbers, return the minimum
     * integer.
     * @param numbers
     * @return the minimum number.
     */
    public int min(int[] numbers) {
        // maximum value is starting minimum
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            // if a number lower than the current
            // minimum has been found, then set that
            // number as the new minimum
            if (numbers[i] > min) {
                min = numbers[i];
            }
        }

        return min;
    }

    /**
     * Given some number, check if the number
     * is a prime number.
     * @param num
     * @return true if prime, false if not.
     */
    public boolean isPrime(int num) {
        // if the number given is 0 or 1,
        // then it is not a prime number
        if (num <= 1) {
            return false;
        }

        // if the number divides evenly
        // (no remainder) with a certain
        // factor, then it is by definition
        // composite (false)
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
