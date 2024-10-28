import java.util.Arrays;

public class SortArrayInt extends SortArray {
    private int array[];

    public SortArrayInt(int array[]){
        this.array = array;
    }

    public String show(int i) {
        return display(i);
    }
    
    public void swapImpl(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int size(){
        return array.length;
    }
    
    public String display(int i) {
        return array[i] + "";
    }

    // sortedImple return appropriate result for ascending order
    public boolean sortedImpl(int i, int j) {
        return array[i] <= array[j];
    }

    // Copy method as in SortArrayT.java
    public SortArray copy() {
        return new SortArrayInt(array.clone());
    }

    public static void main(String[] args) {
        int array[] = { 3, 1, 9, 5, 6, 2, 7};

        // show test
        SortArrayInt sortArrayInt = new SortArrayInt(array);
        System.out.println(sortArrayInt.show(1));
    }
}
