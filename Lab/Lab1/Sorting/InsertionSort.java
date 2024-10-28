public class InsertionSort implements SortAlg{
    @Override
    public String name() {
        return "Insertion sort";
    }

    @Override
    public void sort(SortArray a) {
        // Insertion Sort using the SortArrayInt methods which extends SortArray class
        for (int i = 1; i < a.size(); i++) {
            for (int j = i; j > 0 && a.sorted(j, j - 1); j--) {
                a.swap(j, j - 1);
            }
        }
    }
    
}
