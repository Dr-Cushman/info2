import java.util.ArrayList;
import java.util.Arrays;
import java.io.FileInputStream;
import java.util.Scanner;

/**
 * Class SortTest.
 * 
 * @author Alexander Müller-Lobeck
 * @version 1.0 (Oct 2024)
 */
public class SortTest extends SortRandom
{
    private ArrayList<SortAlg> algs;

    
    /**
     * Returns (for n > 0) ceiling(log2(n)), i.e. the minimal l >= 0 such that n <= 2 ^ l.
     */
    private static int log(int n)
    {
        // TODO: Make this return log2(n)!
        return (int) Math.ceil(Math.log(n) / Math.log(2));
    }
    
    /**
     * Constructor
     */
    public SortTest()
    {
        algs = new ArrayList<SortAlg>();
    }
    
    /**
     * Adds the given SortAlg to the list of SortAlgs.
     */
    private void addAlg(SortAlg alg)
    {
        algs.add(alg);
    }
    
    /**
     * Runs the list of SortAlgs on the given SortArray and displays the results.
     */
    private void runAlgs(SortArray a, boolean showArray)
    {
        if (showArray)
        showArray(a);
        separator();
        showComplexities(a.size());
        
        for (SortAlg alg : algs)
        {
            doSort(a, alg, showArray);
        }
    }
    
    /**
     * Displays some "interesting" complexities for the given n.
     */
    private static void showComplexities(int n)
    {
        int l = log(n);
        System.out.println("n             = " + n);
        System.out.println("log n         = " + l);
        System.out.println("n·log n       = " + (n * l));
        System.out.println("n·(n-1)/2     = " + ((n * (n - 1)) / 2));
    }
    
    /**
     * Performs a sort operation (on a copy of array a) and shows the results.
     */
    private static void doSort(SortArray a, SortAlg alg, boolean showArray)
    {
        SortArray c = a.copy();
        alg.sort(c);
        int n = c.size(), comps = c.comps(), swaps = c.swaps();
        separator();
        System.out.println(alg.name());
        separator();
        if (showArray)
        showArray(c);
        System.out.println("# comparisons = " + comps);
        System.out.println("# swaps       = " + swaps);
        if (!isSorted(c))
        System.out.println("ERROR: Not sorted!");
    }
    
    /**
     * Displays a separator.
     */
    private static void separator()
    {
        System.out.println("------------------------");
    }
    
    /**
     * Displays the given array.
     */
    private static void showArray(SortArray a)
    {
        int n = a.size();
        System.out.print("[");
        for (int i = 0; i < n; i++)
        System.out.print(" " + a.display(i));
        System.out.println(" ]");    
    }
    
    /**
     * Returns true iff the given array is sorted. Note that this does not affect the sort statistics.
     */
    private static boolean isSorted(SortArray a)
    {
        int n = a.size();
        for (int i = 1; i < n; i++) {
            if (!a.sortedImpl(i - 1, i))
            return false;
        }
        return true;
    }
    
    /**
     * Creates an int array consisting of random integers in the given range.
     */
    private int[] randomInts(int size, int min, int range)
    {
        int[] a = new int[size];
        for (int i = 0; i < size; i++)
        a[i] = rnd(min, range);
        return a;
    }
    
    /**
     * Creates a String array from a file containing space-separated strings.
     */
    private String[] readStrings(String path)
    {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
        }
        catch(Exception e) {
            return null;
        }
        String text = new Scanner(fis).useDelimiter("\\A").next();
        return text.split(" ");
    }
    public static void main(String[] args){
        SortTest test = new SortTest();

        // test.addAlg(new SelectionSort());
        // test.addAlg(new InsertionSort());
        // test.runAlgs(new SortArrayInt(test.randomInts(20, 0, 100)), true);
        // test.runAlgs(new SortArrayString(test.readStrings("names.txt")), false);

        // Read names.txt into a String array
        String[] names = test.readStrings("names.txt");
        // Create a SortArrayString object with the names array
        SortArrayString sortArrayString = new SortArrayString(names);
        // showArray
        test.showArray(sortArrayString);
    }
}
