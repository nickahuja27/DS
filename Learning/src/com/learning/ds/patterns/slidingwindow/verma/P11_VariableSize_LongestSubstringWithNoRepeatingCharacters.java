package com.learning.ds.patterns.slidingwindow.verma;

import java.util.HashMap;

public class P11_VariableSize_LongestSubstringWithNoRepeatingCharacters {
    public static void main(String[] args) {
        find("ABCAABCDEABC");
    }

    private static void find(String inString) {
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> counterMap = new HashMap<>();
        int maxLength = 0;

        while (end < inString.length()) {
            counterMap.put(inString.charAt(end), counterMap.getOrDefault(inString.charAt(end), 0) + 1);

            if((end - start + 1) == counterMap.size()) {
                System.out.println("Length is: " + (end - start + 1));
                maxLength = Math.max(maxLength, (end - start + 1));
                end++;
            } else if ((end - start + 1) > counterMap.size()) {
                /** A B C A A B C D E A B C
                 *          ^
                 * when you hit A at index 4, you have to remove BCA from the map,
                 * Hence the condition: "counterMap.get(inString.charAt(end)) != 1"
                 */
                while (start <= end && (end - start + 1) > counterMap.size() && counterMap.get(inString.charAt(end)) != 1) {
                    char charToRemove = inString.charAt(start);
                    counterMap.put(charToRemove, counterMap.get(charToRemove) - 1);
                    if(counterMap.get(charToRemove) == 0)
                        counterMap.remove(charToRemove);
                    start++;
                }
                end++;
            }
        }
        System.out.println("Maximum Length is: " + maxLength);
    }
}
