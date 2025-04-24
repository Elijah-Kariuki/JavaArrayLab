package com.elijah.arraymanipulationandforloops;

import java.util.Arrays;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int index = 3;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Element at index: " + index + ": " + numbers[index]);

    }
}
