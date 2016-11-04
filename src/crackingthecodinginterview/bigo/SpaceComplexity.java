package crackingthecodinginterview.bigo;

/**
 * Created by diakabanab on 10/30/2016.
 */
class SpaceComplexity {
    /**
     * Finds the sum of integers from 0-(n-1). This algorithm take O(n) time and O(n) space
     * for each recursive stack call
     * @param n
     * @return
     */
    int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n-1);
    }

    /**
     * adds adjacent elements between 0 and n. Time complexity is O(n). Space complexity is O(1) since
     * the calls to pairSum() won't rest on the call stack
     * @param n
     * @return
     */
    int pairSumSequence(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += pairSum(i, i + 1);
        }
        return sum;
    }

    int pairSum(int a, int b) {
        return a + b;
    }
}

