import java.util.Random;

/**
 * Class RandomTools.
 * 
 * @author Alexander Müller-Lobeck
 * @version 1.0 (Oct 2024)
 */
public interface Randomness
{
    public static final Random random = new Random();

    public default int rnd(int min, int range)
    {
        return min + random.nextInt(range);
    }

    private int[] randomInts(int size, int min, int range){
        int[] a = new int[size];
        for (int i = 0; i < size; i++)
            a[i] = rnd(min, range);
        return a;
    }

    /**
     * Returns a random character based on the given flags.
     * Currently supported flags are (you can combine multiple flags via |):
     * 1 - lowercase letters (a - z)
     * 2 - uppercase letters (A - Z)
     * 4 - decimal digits (0 - 9)
     */
    public default char rndChar(int flags)
    {
        final int[] range = { 26, 26, 10, 0 };  /** numbers of elements for flags 1, 2, 4, ... (0 marks the end) */
        final int[] start = { 97, 65, 48, 0 };  /** ASCII offsets for flags 1, 2, 4, ... (0 marks the end) */
        /** The following code is generic, i.e. you just need to adjust the 'range' and 'start' arrays for supporting new flags. 
            Just make sure the ranges don't overlap, otherwise you might get a skewed random distribution when combining flags. */
        int i = 0, m = 1, n = 0;
        while (range[i] > 0 && flags >= m) {
            if ((flags & m) > 0)
                n += range[i];
            i++;
            m <<= 1;
        }
        n = rnd(0, n);
        i = 0;
        m = 1;
        while (flags >= m) {
            if ((flags & m) > 0) {
                if (n < range[i])
                    break;
                n -= range[i];
            }
            i++;
            m <<= 1;
        }
        return (char)(start[i] + n);
    }
}
