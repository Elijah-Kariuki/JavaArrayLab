package com.elijah.arraymanipulationandforloops;

public class MinMaxFinder {
    public static void main(String[] args) {
        int numbers[] = {9, 2, 14, 3, 18, 7};
        int min = numbers[0], max = numbers[0];

        for (int number : numbers) {
            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }
        System.out.printf("Minimum : %d\n", min);
        System.out.printf("Max : %d\n", max);
    }
}
