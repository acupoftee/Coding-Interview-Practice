package net.bethydiakabana.interview.ctci.bigo;

/**
 * Created by diakabanab on 10/30/2016.
 */
class DroppingConstants {
    /**
     * Time complexity: O(N)
     * @param array
     */
    void minAndMaxOne(int[] array) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int x : array) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
    }

    /**
     * Time complexity: O(2N)
     * @param array
     */
    void minAndMaxTwo(int[] array) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int x : array) {
            if (x < min) min = x;
        }
        for (int x : array) {
            if (x > max) max = x;
        }
    }
}
