package crackingthecodinginterview.chapter1;

import java.util.HashSet;

/**
 * Implements an algorithm to determine if a string has all
 * unique characters with, and without a data structure.
 *
 */
public class IsUnique {
    /**
     * Checks to see if a string contains unique characters by using a HashSet.
     * @param str string to be tested
     * @return true if all characters are unique
     */
    static boolean isUniqueWithDS(String str) {
        HashSet<Character> set = new HashSet<>();
        for (Character c : str.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }

    /**
     * Checks if a string contains unique characters
     * @param str string to be tested
     * @return true if all characters are unique
     */
    static boolean isUniqueWithoutDS(String str) {
        boolean[] characters = new boolean[128]; // 128 ascii characters

        for (int i = 0; i < str.length(); i++) {
            int asciiValue = str.charAt(i);
            if (characters[asciiValue]) {
                return false;
            }
            characters[asciiValue] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(IsUnique.isUniqueWithDS("abcdefef"));
        System.out.println(IsUnique.isUniqueWithoutDS("abcdefef"));
    }
}
