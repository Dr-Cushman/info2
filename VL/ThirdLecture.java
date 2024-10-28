/**
 * ThirdLecture
 */
public class ThirdLecture {

    /*
     * We list all the natural numbers below 10 that are multiples of 3 or 5 we get 3 5 6 and 9 The sum of these multiples is 23 
     * Method that takes an integer parameter n>0 and calculates the sum of all the multiples of 3 or 5 below n
     */
    public static int sum_of_multiples_of_3_and_5(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {               // 2 per iteration
            if (i % 3 == 0 || i % 5 == 0) {         // 1 or 2 per iteration -> if i % 3 is true it is just 1 iteration -> if i % 5 is true it is 2 iterations!!! 
                                                    // It does not check both conditions at the same time
                sum += i;                           // 0 or 1 per iteration
            }
        }
        System.out.println(sum);
        return sum;
    }

    // Best case: 2 + 1 + 0 = 3 per iteration 
    // Worst case: 2 + 2 + 1 = 5 per iteration
    // 
    // 3(n-1) <= Time complexity <= 5(n-1)
    // O(n-1) = O(n)


    // Comlexity of the algorithm is O(n)
    // i läuft von 0 bis n-1   -> n

    int sum_of_multiples_of_3_and_5_below_100() {
        int sum3 = (3 + 99) * 33 / 2;
        int sum5 = (5 + 95) * 19 / 2;
        int sum15 = (15 + 90) * 6 / 2;

        return sum3 + sum5 - sum15;

    }


    // Comlexity of min is O(n)
    int min(int[] arr) {
        int minimum = Integer.MAX_VALUE; // 1 per method call
        for (int i = 0; i < arr.length; i++) { // 2 per iteration
            if (arr[i] < minimum) { // n per iteration
                minimum = arr[i]; // 0, n per iteration
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        ThirdLecture tl = new ThirdLecture();
        int[] arr = {2, 8, 6, 5, 1};
        System.out.println(tl.min(arr));
    }
}