/**
 * LeetCodeProblemIsPalindrome
 * Example 1:

 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * 
 * Example 2:
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * 
 * Example 3:
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */
public class LeetCodeProblemIsPalindrome {

    public boolean isPalindrome(int x) {
        boolean result = true;

        String s = String.valueOf(x);
        if (s == null) {
            result = false;
        } else {
            for (int i = 0; i < s.length() / 2 ; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {

                    result = false;
                    break;
                }
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        LeetCodeProblemIsPalindrome lcp = new LeetCodeProblemIsPalindrome();
        System.out.println(lcp.isPalindrome(121));
        System.out.println(lcp.isPalindrome(-121));
        System.out.println(lcp.isPalindrome(10));
    }
}