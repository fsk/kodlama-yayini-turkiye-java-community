package org.fsk.toplama_5_binarysearch;

import java.util.Arrays;

public class Toplama3 {

    public static void main(String[] args) {
        System.out.println(binarySearchWithIteration(new int[]{3,5,2,6,7}, 5));
    }

    private static int binarySearchWithIteration(int[] arr, int target) {

        Arrays.sort(arr);

        int min = 0;
        int max = arr.length - 1;
        int mid;
        int index = -1;

        while (min <= max) {
            mid = (min + max) / 2;
            if (arr[mid] < target) {
                min = mid + 1;
            }else if (arr[mid] > target) {
                max = mid - 1;
            }else if (arr[mid] == target) {
                index = mid;
                break;
            }
        }
        return index;
    }

}
