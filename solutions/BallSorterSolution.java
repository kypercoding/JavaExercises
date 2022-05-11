package solutions;

import java.util.ArrayList;

import interfaces.BallSorter;

public class BallSorterSolution implements BallSorter{
    // variable corresponding to set of green balls
    private ArrayList<Character> green;

    // variable corresponding to set of blue balls
    private ArrayList<Character> blue;

    // variable corresponding to set of red balls
    private ArrayList<Character> red;

    /**
     * Initializes ArrayList bins of ball colors.
     */
    public BallSorterSolution() {
        this.green = new ArrayList<>();
        this.blue = new ArrayList<>();
        this.red = new ArrayList<>();
    }

    /**
     * Given a set of R,G,B balls, the BallSorter
     * sorts the balls into three different
     * bins.
     * 
     * @param balls, where each character in the
     * array represents a colored ball (i.e. 'R' for red, etc.).
     */
    public void sort(char[] balls) {
        // for every ball in the original set,
        // it is placed in separate lists based
        // on color
        for (int i = 0; i < balls.length; i++) {
            if (balls[i] == 'R') {
                this.red.add(balls[i]);
            } else if (balls[i] == 'G') {
                this.green.add(balls[i]);
            } else {
                this.blue.add(balls[i]);
            }
        }
    }

    /**
     * Returns the set of red balls.
     * 
     * @return ArrayList<Character> of red balls.
     */
    public ArrayList<Character> getRedBalls() {
        return this.red;
    }

    /**
     * Returns the set of blue balls.
     *
     * @return ArrayList<Character> of blue balls.
     */
    public ArrayList<Character> getBlueBalls() {
        return this.blue;
    }
    
    /**
     * Returns the set of blue balls.
     *
     * @return ArrayList<Character> of blue balls.
     */
    public ArrayList<Character> getGreenBalls() {
        return this.green;
    }
}
