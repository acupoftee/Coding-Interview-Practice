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
     * Time complexity: O(n)
     * @param str string to be tested.
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
     * Checks if a string contains unique characters.
     * Time complexity: O(n)
     * @param str string to be tested
     * @return true if all characters are unique
     */
    static boolean isUniqueWithBooleanArray(String str) {
        if (str.length() > 128) {
            return false;
        }

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

    /**
     * Checks if a string contains unique characters by doing the following:
     * <ol>
     *     <li>sets an integer checker to zero</li>
     *     <li>sets an ascii value by subtracting the value of 'a', saving space by a factor of 8</li>
     *     <li>returns false if the bit vector contains a value after bit arithmetic</li>
     * </ol>
     * @param str
     * @return
     */
    static boolean isUniqueWithBitVector(String str) {
        int checker = 0;
        for (int i = 0; i < 128; i++) {
            int asciiValue = str.charAt(i) - 'a';
            if ((checker & (1 << asciiValue)) > 0) {
                return false;
            }
            checker |= (1 << asciiValue);
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "abcdeff";
        System.out.println(IsUnique.isUniqueWithDS(str));
        System.out.println(IsUnique.isUniqueWithBooleanArray(str));
        System.out.println(IsUnique.isUniqueWithBitVector(str));
    }
}
