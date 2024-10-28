public class SortHelper {
    public static void doSort(SortArray array, SortAlg algorithm, boolean showArray) {
        algorithm.sort(array);
        if (showArray) {
            System.out.println(array);
        }
    }
}