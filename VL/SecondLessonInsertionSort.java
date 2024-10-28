/**
 * SecondLessonInsertionSort / 10-OCT-24
 * 
 */
/**
 * SecondLessonInsertionSort
 */
public class SecondLessonInsertionSort {

    public void insertionSort(int[] a) {
        System.out.println("Array length: " + a.length);
        for (int king = 1; king < a.length; king++) {
            int value = a[king];
            int queen = king;
            while (queen > 0 && a[queen - 1] > value) {
                a[queen] = a[queen - 1];
                queen--;
            }
            a[queen] = value;
        }
    
    
        
    }

    public static void main(String[] args) {
        SecondLessonInsertionSort secondLessonInsertionSort = new SecondLessonInsertionSort();
        int[] a = { 5, 2, 4, 6, 1, 3 };
        secondLessonInsertionSort.insertionSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}