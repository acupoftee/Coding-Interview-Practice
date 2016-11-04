package crackingthecodinginterview.bigo;

/**
 * Created by diakabanab on 10/30/2016.
 */
 class Fibonacci {
    /**
     * Time complexity: O(2^n) since there are two calls to
     * fibonacci, which run independently. The space complexity is still O(N)
     * @param n
     * @return
     */
    int fibonacci(int n) {
        if (n <= 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 1);
    }
}
