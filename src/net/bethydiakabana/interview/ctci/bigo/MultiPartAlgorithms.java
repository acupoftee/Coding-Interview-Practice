package net.bethydiakabana.interview.ctci.bigo;

/**
 * Created by diakabanab on 10/30/2016.
 */
class MultiPartAlgorithms {
    /**
     * We are executing two separate for loops, therefore we need to add
     * the runtime of A and B. Time complexity: O(A + B)
     * @param arrayA
     * @param arrayB
     */
    void addRuntime(int[] arrayA, int[] arrayB) {
        for (int a : arrayA) System.out.println(a);
        for (int b : arrayB) System.out.println(b);
    }
}
