
/**
 * Class Tools.
 * 
 * @author Alexander Müller-Lobeck
 * @version 1.0 (Oct 2024)
 */
public interface Tools
{
    public class Clock
    {
        public long clock;
        public Clock() { clock = 0; }
        public void start() { clock = System.currentTimeMillis(); }
        public long stop() { return System.currentTimeMillis() - clock; }
    }
    
    public final Clock clock = new Clock();
        
    /**
     * Starts a millisecond timer.
     */
    public default void startTimer()
    {
        clock.start();
    }

    /**
     * Stops the millisecond timer and returns the number of milliseconds passed since 'startTimer'.
     */
    public default long stopTimer()
    {
        return clock.stop();
    }
    
    /**
     * Stops the millisecond timer and prints the time elapsed since 'startTimer'.
     * If 'split' is false then just the milliseconds will be printed.
     * If 'split' is true then the method will print the time in h:m:s:ms format.
     */
    public default void showTimer(boolean split)
    {
        long ms = clock.stop();
        if (split) {
            long h = ms;
            ms = h % 1000;
            h /= 1000;
            long s = h % 60;
            h /= 60;
            long m = h % 60;
            h /= 60;
            print(h + " h : " + m + " m : " + s + " s : ");
        }
        println(ms + " ms");
    }

    /**
     * I _hate_ having to type "System.out.print(...)" for printing something in Java!
     */
    public default void print(Object s)
    {
        System.out.print(s);
    }

    /**
     * See comment for the 'print()' method...
     */
    public default void println(Object s)
    {
        System.out.println(s);
    }

    /**
     * Prints 'n' times 's' (in O(log n), not O(n)!).
     */
    public default void printN(Object s, int n)
    {
        if (n <= 0)
            return;
        String str = s.toString();
        while (true) {
            if ((n & 1) > 0)
                System.out.print(str);
            n >>= 1;
            if (n == 0)
                break;
            str = str + str;
        }
    }

    /**
     * Prints a separator line of the given length.
     */
    public default void separator(int len)
    {
        printN("—", len);
        System.out.println("");
    }

    /**
     * Prints a default separator line of length 80.
     */
    public default void separator()
    {
        System.out.println("————————————————————————————————————————————————————————————————————————————————");
    }
}
