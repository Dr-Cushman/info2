import java.util.Random;
import java.util.Arrays;

/**
 * Class SortRandom.
 * 
 * @author Alexander Müller-Lobeck
 * @version 1.0 (Oct 2024)
 */
public class SortRandom
{
    private Random rand;
    
    public SortRandom()
    {
        rand = new Random();
    }
    
    /**
     * Returns a random integer in { min, ..., min + range - 1 }.
     * 
     */
    public int rnd(int min, int range)
    {
        return min + rand.nextInt(range);
    }


}
