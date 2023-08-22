package org.fsk.toplama_5_binarysearch;

public class Toplama3BST {

    public static void main(String[] args) {

        System.out.println(plusWithBST(4,7));

    }

    private static int plusWithBST(int a, int b) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (min <= max) {

            int mid = (min + max) / 2;
            if (mid == a + b) return mid;
            else if (mid > a + b) max = mid - 1;
            else min = mid + 1;

        }

        return -1;
    }
}
