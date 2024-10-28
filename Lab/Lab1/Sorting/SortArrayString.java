public class SortArrayString extends SortArray {
    private String[] array;

    public SortArrayString(String[] array) {
        this.array = array;
    }
    
    public String show(int i) {
        return display(i);
    }

    public void swapImpl(int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int size() {
        return array.length;
    }

    public String display(int i) {
        return array[i];
    }

    public boolean sortedImpl(int i, int j) {
        // check if array[i] is less than or equal to array[j]
        return array[i].compareTo(array[j]) <= 0;
    }

    public SortArray copy() {
        return new SortArrayString(array.clone());
    }   
}
