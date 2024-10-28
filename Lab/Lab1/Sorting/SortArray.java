
/**
 * Abstract class SortArray.
 * 
 * @author Alexander Müller-Lobeck
 * @version 1.0 (Oct 2024)
 */
public abstract class SortArray
{
    private int numComps;   // the number of comparisons performed
    private int numSwaps;   // the number of swaps performed
    
    /**
     * Constructor
     */
    public SortArray()
    {
        reset();
    }

    /**
     * Resets the comparisons/swaps statistics.
     */
    public void reset()
    {
        numComps = 0;
        numSwaps = 0;
    }
    
    /**
     * Returns the number of comparisons.
     */
    public int comps()
    {
        return numComps;    
    }
    
    /**
     * Returns the number of swaps.
     */
    public int swaps()
    {
        return numSwaps;    
    }
    
    /**
     * Swaps the elements at index i and j.
     */
    public void swap(int i, int j)
    {
        numSwaps++;
        swapImpl(i, j);
    }

    /**
     * Returns true iff the elements at index i and j are in sorted order.
     */
    public boolean sorted(int i, int j)
    {
        numComps++;
        return sortedImpl(i, j);
    }
    
    /**
     * Returns the size of the array. (Must be implemented by derived class)
     */
    public abstract int size();
    
    /**
     * Returns a display string for the element at index i. (Must be implemented by derived class)
     */
    public abstract String display(int i);
    
    /**
     * Swaps the elements at index i and j. (Must be implemented by derived class)
     */
    protected abstract void swapImpl(int i, int j);
    
    /**
     * Returns true iff the elements at index i and j are in sorted order. (Must be implemented by derived class)
     */
    protected abstract boolean sortedImpl(int i, int j);
    
    /**
     * Returns a copy of the array.
     */
    public abstract SortArray copy();
}
