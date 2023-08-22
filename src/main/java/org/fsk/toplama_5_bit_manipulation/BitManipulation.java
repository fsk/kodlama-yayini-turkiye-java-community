package org.fsk.toplama_6_bit_manipulation;

public class BitManipulation {

    public static void main(String[] args) {
        System.out.println(sum(-3,-5));
    }

    private static int sum(int a, int b) {
        if (a == 0) return b;
        else if (b == 0) return a;
        else return sum(a ^ b, (a & b) << 1);
    }
}
