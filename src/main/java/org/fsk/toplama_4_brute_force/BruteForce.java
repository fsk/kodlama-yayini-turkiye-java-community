package org.fsk.toplama_4_bruth_force;

public class BruteForce {

    public static void main(String[] args) {
        System.out.println(sum(4,3));
    }

    private static int sum(int a, int b) {
        for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if (a + b == i) {
                return i;
            }
        }
        return 0;
    }
}
