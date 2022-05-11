package interfaces;

public interface Mathematics {
    /**
     * Given an integer n, print the nth number in the
     * Fibonnaci sequence.
     * @param n
     * @return nth number of Fibonnaci sequence.
     */
    public int fibonnaci(int n);

    /**
     * Given an integer n, print n! (factorial of n).
     * @param n
     * @return n!
     */
    public int factorial(int n);

    /**
     * Calculate the Euclidean distance between
     * two points (x1, y1) and (x2, y2).
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return distance between points.
     */
    public double distance(int x1, int y1, int x2, int y2);

    /**
     * Given a set of numbers, calculate the arithmetic
     * mean (average) of the numbers.
     * @param numbers
     * @return mean of int[] numbers
     */
    public double mean(int[] numbers);

    /**
     * Given a set of numbers, return the maximum
     * integer.
     * @param numbers
     * @return the maximum number.
     */
    public int max(int[] numbers);

    /**
     * Given a set of numbers, return the minimum
     * integer.
     * @param numbers
     * @return the minimum number.
     */
    public int min(int[] numbers);

    /**
     * Given some number, check if the number
     * is a prime number.
     * @param num
     * @return true if prime, false if not.
     */
    public boolean isPrime(int num);
}
