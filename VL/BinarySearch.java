public class BinarySearch {
    // Divide and COnquer Binary search 

    public int binarySearchRec(int[] arr, int lo, int hi, int e) {
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (arr[mid] > e) {
            return binarySearchRec(arr, lo, mid - 1, e);
        } else if (arr[mid] < e) {
            return binarySearchRec(arr, mid + 1, hi, e);
        } else {
            return mid;
        }

        
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.binarySearchRec(arr, 0, arr.length - 1, 5));
    }
}


// log2 of 1000000 in jshell -> Math.log(1000000) / Math.log(2) -> 19.931568569324174