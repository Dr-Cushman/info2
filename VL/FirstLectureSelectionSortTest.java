/**
 * First Lecture Notes / Tests 09-OCT-24
 */
public class FirstLectureSelectionSortTest {

    // Testarrays
    static int[] arrayToSort = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    static int[] randomArray = new int[5];
    static int[] staticArray = {2, 8, 6, 5, 1};



    // Function that sorts an array 
    static void sortArrayAscending(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[minIndex] > a[j]) {
                    minIndex = j;
                }
            }
            swap(a, i, minIndex);
        }
    }
    
    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    static void fillArrayWithFiveRandomNumbers() {
        for(int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }
    }


    

    // static void findSmallestNumber() {
    //     for (int i : randomArray) {
    //         int temp = smallestNumber
            
    //     }

    // }
    

    /*---------------------------------------------------LECTURE---------------------------------------------------*/
    // Unterricht 
    // Length of an array is declared as n to analyze the time complexity of the algorithm
    // The time complexity of the algorithm is O(n^2)
    static void selectionSort(int[] a) {
        for (int king = 0; king < a.length-1; king++) {
            int jack = king;
            for (int queen = king+1; queen < a.length; queen++) {
                if (a[jack] < a[queen]) {
                    jack = queen;
                }
            }
            swap(a, king, jack);
        }
    }

    public static void main(String[] args) {

        fillArrayWithFiveRandomNumbers();
        for (int num : randomArray) {
            System.out.println(num);
        }

        sortArrayAscending(staticArray);

        for (int num : randomArray) {
            System.out.println(num);
        }
        
    }
}