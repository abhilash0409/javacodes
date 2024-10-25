package DailyPractise;

import java.util.HashMap;
import java.util.Map;

public class Permutation {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }


        Map<Character, Integer> s1Count = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Count.put(c, s1Count.getOrDefault(c, 0) + 1);
        }


        Map<Character, Integer> s2Count = new HashMap<>();
        int windowSize = s1.length();


        for (int i = 0; i < windowSize; i++) {
            s2Count.put(s2.charAt(i), s2Count.getOrDefault(s2.charAt(i), 0) + 1);
        }


        if (s1Count.equals(s2Count)) {
            return true;
        }


        for (int i = windowSize; i < s2.length(); i++) {

            char newChar = s2.charAt(i);
            s2Count.put(newChar, s2Count.getOrDefault(newChar, 0) + 1);


            char leftChar = s2.charAt(i - windowSize);
            s2Count.put(leftChar, s2Count.get(leftChar) - 1);
            if (s2Count.get(leftChar) == 0) {
                s2Count.remove(leftChar);
            }

            if (s1Count.equals(s2Count)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Permutation solution = new Permutation();
        String s1 = "ab";
        String s2 = "eidbaooo";
        boolean result = solution.checkInclusion(s1, s2);
        System.out.println("Permutation exists: " + result);
    }
}
