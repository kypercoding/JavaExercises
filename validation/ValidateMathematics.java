package validation;

import java.util.Random;

import exercises.MathematicsStudent;
import interfaces.Mathematics;
import solutions.MathematicsSolution;

public class ValidateMathematics {
    /**
     * Run preliminary tests on implementations of Mathematics.
     * 
     * @return true if implementation is valid.
     */
    public static void validateImplementation(Mathematics m) {
        assert(m != null);
    }

    public static void testMathematics() {
        // student implementation
        MathematicsStudent student = new MathematicsStudent();

        // solution implementation
        MathematicsSolution solution = new MathematicsSolution();

        validateImplementation(student);
        validateImplementation(solution);

        // generates random number for fibonnaci sequence
        // between 1-50
        Random random = new Random();
        int n = random.nextInt(50) + 1;

        // ensures fibonnaci is same between solution
        // and student
        int f1 = student.fibonnaci(n);
        int f2 = solution.fibonnaci(n);

        assert(f1 == f2);

        // generates random number for factorial between
        // 1-10
        n = random.nextInt(10) + 1;

        // ensures factorial is same between solution
        // and student
        f1 = student.factorial(n);
        f2 = solution.factorial(n);

        assert(f1 == f2);

        // generates random x1, x2, y1, y2
        int x1 = random.nextInt(100) + 1;
        int x2 = random.nextInt(100) + 1;
        int y1 = random.nextInt(100) + 1;
        int y2 = random.nextInt(100) + 1;

        // ensures euclidean distance is same between
        // solution and student
        double e1 = student.distance(x1, y1, x2, y2);
        double e2 = solution.distance(x1, y1, x2, y2);

        assert(e1 == e2);

        // generates random list of numbers
        int size = random.nextInt(50);
        int[] nums = new int[size];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(1000);
        }

        // ensures mean, minimum, and maximum return
        // same values
        assert(student.mean(nums) == solution.mean(nums));
        assert(student.min(nums) == solution.min(nums));
        assert(student.max(nums) == solution.max(nums));

        // generates ranodm number
        n = random.nextInt(100);

        // ensures isPrime() returns the same for both
        // implementations
        assert(student.isPrime(n) == solution.isPrime(n));
    }
}
