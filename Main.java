import java.util.Scanner;

import validation.ValidateBallSorter;
import validation.ValidateMathematics;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean b = false;

        while (!b) {
            System.out.println("What would you like to do?");

            // asks for prompt from terminal
            String prompt = scanner.nextLine();
            
            System.out.println("Loading...");

            switch (prompt) {
                // tests student BallSorter exercise
                case "BallSorter":
                    ValidateBallSorter.testBallSorter();
                    break;
                // tests student Mathematics exercise
                case "Mathematics":
                    ValidateMathematics.testMathematics();
                    break;
                // finishes loop when no input is passed
                // in
                case "":
                    b = true;
                    break;
                default:
                    continue;
            }

            System.out.println("Done!");
        }

        scanner.close();
    }
}
