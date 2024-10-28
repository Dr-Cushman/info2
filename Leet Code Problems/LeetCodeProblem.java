/**
 * LeetCodeProblem
 * 
 * Array [2, 7, 11, 15] Target 9 -> 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:

 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class LeetCodeProblem {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        boolean subtrahendFound = false;

        for (int i = 0; i < nums.length-1 && subtrahendFound != true; i++) {
            
            int tempA = nums[i];
            int left = target - tempA; 
            System.out.println("dbg. var: left / subtrahend to find:" + left);

            // Write current minuend index to result array
            result[0] = i;

            // Check the rest of the array if the subtrahend is in it
            for (int j = i+1; j < nums.length; j++) {
                int tempB = nums[j];



                // The subtrahend must equate to zero with what is "left" in order to classify it / find it.
                // If its found imidiatly break the loop
                if (left - tempB == 0) {
                    // Print out that the subtrahend was found
                    System.out.println("dbg. subtrahend found at INDEX: " + j + " with Value: " + tempB);

                    // Save the index of the subtrahend
                    result[1] = j;
                    subtrahendFound = true;
                    break;
                }
            }
        }

        // Print array elements
        for (int i : result) {
            System.out.println(i);
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int[] arr2 = {3, 2, 4};
        int target = 9;
        int target2 = 6;

        LeetCodeProblem lcp = new LeetCodeProblem();
        // lcp.twoSum(arr, target);
        lcp.twoSum(arr2, target2);
    }
}