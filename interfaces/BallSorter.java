package interfaces;

import java.util.ArrayList;

public interface BallSorter {
    /**
     * Given a set of R,G,B balls, the BallSorter
     * sorts the balls into three different
     * bins.
     * 
     * @param balls, where each character in the
     * array represents a colored ball (i.e. 'R' for red, etc.).
     */
    public void sort(char[] balls);

    /**
     * Returns the set of red balls.
     * 
     * @return ArrayList<Character> of red balls.
     */
    public ArrayList<Character> getRedBalls();

    /**
     * Returns the set of blue balls.
     *
     * @return ArrayList<Character> of blue balls.
     */
    public ArrayList<Character> getBlueBalls();
    
    /**
     * Returns the set of blue balls.
     *
     * @return ArrayList<Character> of blue balls.
     */
    public ArrayList<Character> getGreenBalls();
}
