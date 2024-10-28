import java.util.HashMap;

/**
 * LeetCodeProblemRomanToInteger
 * 
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000
 * 
 * For example, 2 is written as II in Roman numeral, just two ones added together. 
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. 
 * Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
 * The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * 
 * Example 1:
 * Input: s = "III"
 * Output: 3
 * Explanation: III = 3.
 * 
 * Example 2:
 * Input: s = "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * 
 * Example 3:
 * Input: s = "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class LeetCodeProblemRomanToInteger {

    public int romanToInt(String s) {

        // Setup a hashmap to store the roman letter and its corresponding integer value
        HashMap<Character, Integer> romanLetterMap = new HashMap<>();
        
        // Fill the hashmap with the roman letter and its corresponding integer value
        romanLetterMap.put('I', 1);
        romanLetterMap.put('V', 5);
        romanLetterMap.put('X', 10);
        romanLetterMap.put('L', 50);
        romanLetterMap.put('C', 100);
        romanLetterMap.put('D', 500);
        romanLetterMap.put('M', 1000);

        // Total value to count on 
        int total = 0;

        // Read the string / iterate through it 
        for (int i = 0; i < s.length(); i++) {
            // Get Value of current char at position
            int currentVal = romanLetterMap.get(s.charAt(i));
            System.out.println("Current Value: " + currentVal);

            // Check if the current character is the last one
            if (i < s.length() - 1) {
                // Get Value of next char at position
                int nextVal = romanLetterMap.get(s.charAt(i + 1));

                // If the current value is less than the next value, subtract the current value from the total
                if (currentVal < nextVal) {
                    total -= currentVal;
                } else {
                    total += currentVal;
                }
            } else {
                total += currentVal;
            }
        }

        System.out.println("Total: " + total);
        return total;
    }
    

    public static void main(String[] args) {
        LeetCodeProblemRomanToInteger romanToInteger = new LeetCodeProblemRomanToInteger();
        romanToInteger.romanToInt("XIV");
    }
}