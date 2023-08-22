package org.fsk.toplama_2_list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Toplama2 {

    public static void main(String[] args) {
        System.out.println(toplama2(4,6));
    }

    private static int toplama2(int a, int b) {
        List<Integer> num1 = Arrays.asList(new Integer[a]);
        List<Integer> num2 = (Arrays.asList(new Integer[b]));
        return Stream.concat(num1.stream(), num2.stream()).toList().size();
    }
}
