package validation;

import interfaces.BallSorter;
import solutions.BallSorterSolution;
import exercises.BallSorterStudent;

import java.util.Random;

public class ValidateBallSorter {
    /**
     * Run preliminary tests on implementations of BallSorter.
     * 
     * @return true if implementation is valid.
     */
    private static void validateImplementation(BallSorter b) {
        // ensures object was instantiated correctly
        assert(b != null);

        // ensures that outputs are not null
        // (i.e. lists are initialized)
        assert(b.getRedBalls() != null);
        assert(b.getGreenBalls() != null);
        assert(b.getBlueBalls() != null);
    }


    /**
     * Tests student implementation of BallSorter
     * vs. solution implementation of BallSorter.
     */
    public static void testBallSorter() {
        // student implementation
        BallSorter student = new BallSorterStudent();

        // solution implementation
        BallSorter solution = new BallSorterSolution();

        validateImplementation(student);
        validateImplementation(solution);

        // creates random character array of balls
        char[] colors = {'R', 'B', 'G'};

        // generates random array of colors
        Random random = new Random();

        // generates random size of array
        int size = random.nextInt(1000);

        // creates empty array of balls
        char[] balls = new char[size];

        // fills array with random colored balls
        for (int i = 0; i < balls.length; i++) {
            int choice = random.nextInt(colors.length);
            balls[i] = colors[choice];
        }

        // calls sorting implementations of student and solution
        student.sort(balls);
        solution.sort(balls);

        assert(student.getBlueBalls().equals(solution.getBlueBalls()) == true);
        assert(student.getRedBalls().equals(solution.getRedBalls()) == true);
        assert(student.getGreenBalls().equals(solution.getGreenBalls()) == true);
    }
}
