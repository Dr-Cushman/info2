/**
 * Class XSort.
 * 
 * @author Alexander Müller-Lobeck
 * @version 1.0 (Oct 2024)
 */
public class XSort implements SortAlg
{
    public String name()
    {
        return "X sort";    
    }
    
    public void sort(SortArray a)
    {
        int n = a.size();   // array size
        <implement sorting algorithm using a.sorted(i, j) and a.swap(i, j)>
    }
}
