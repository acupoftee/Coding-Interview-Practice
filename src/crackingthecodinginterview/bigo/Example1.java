package crackingthecodinginterview.bigo;

/**
 * Created by diakabanab on 10/30/2016.
 */
class Example1 {
    /**
     * finds the sum and product of array elements.
     * The time compelxity is O(N) because even though there
     * are two different loops, the time complexity depends on the
     * size of the array.
     * @param array
     */
    void foo(int[] array) {
        int sum = 0;
        int product = 1;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        for (int i = 0; i < array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + ", " + product);
    }
}
