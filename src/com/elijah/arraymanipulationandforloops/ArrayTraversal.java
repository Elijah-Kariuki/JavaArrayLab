package com.elijah.arraymanipulationandforloops;

import java.util.Arrays;

public class ArrayTraversal {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        System.out.println(Arrays.toString(numbers));
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
