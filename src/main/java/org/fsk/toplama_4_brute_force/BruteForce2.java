package org.fsk.toplama_4_bruth_force;

public class BruteForce2 {

    public static void main(String[] args) {
        System.out.println(sum(5, 7));
    }

    public static int sum(int num1, int num2) {
        int res = 0;
        while (num1 != 0) {
            res = res + inc(num1);
            num1 = num1 - inc(num1);
        }
        while (num2 != 0) {
            res = res + inc(num2);
            num2 = num2 - inc(num2);
        }
        return res;
    }

    private static int inc(int num) {
        return num > 0 ? 1 : -1;
    }
}
