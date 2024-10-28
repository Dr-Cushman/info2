/**
 * Class SortArrayT.
 * 
 * @author Alexander Müller-Lobeck
 * @version 1.0 (Oct 2024)
 */
public class SortArrayT extends SortArray
{
    private T[] a;
    
    /**
     * Constructor
     */
    public SortArrayT(T[] array)
    {
        a = array;
    }

    public int size()
    {
        return a.length;
    }
    
    public String display(int i)
    {
        return <String representation of element a[i]>;
    }
    
    protected void swapImpl(int i, int j)
    {
        <swap a[i] with a[j]>
    }
    
    protected boolean sortedImpl(int i, int j)
    {
        // For sorting in ascending order:
        return <a[i] <= a[j]>;
    }
    
    public SortArray copy()
    {
        return new SortArrayT(a.clone());
    }
}

