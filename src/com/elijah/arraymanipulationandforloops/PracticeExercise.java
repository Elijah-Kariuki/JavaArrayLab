package com.elijah.arraymanipulationandforloops;

import java.util.Arrays;

public class PracticeExercise {
    public static void main(String[] args) {
        int [] numbers = {3, 5, 9, 6, 2, 8, 12, 4, 7, 10};
        System.out.println(Arrays.toString(numbers));
        System.out.printf("Addition: (index 0 & 1): %d + %d = %d\n", numbers[0], numbers[1], numbers[0] + numbers[1]);
        System.out.printf("Subtraction: (index 2 & 3): %d - %d = %d\n", numbers[2], numbers[3], numbers[2] - numbers[3]);
        System.out.printf("Multiplication: (index 4 & 5): %d * %d = %d\n", numbers[4], numbers[5], numbers[4] * numbers[5]);
        System.out.printf("Division: (index 6 & 7): %d / %d = %d\n", numbers[6], numbers[7], numbers[6] / numbers[7]);
        System.out.printf("Modulus (index 8 & 9): %d %% %d = %d\n", numbers[8], numbers[9], numbers[8] % numbers[9]);

        System.out.println("\nRelational comparison:");
        for(int i = 0; i < numbers.length -1; i++){
            String comparison = numbers[i] > numbers[i+1] ? "greater than" :
                    numbers[i] < numbers[i+1] ? "lesser than" : "equal to";

            System.out.printf("%d is %s %d%n", numbers[i], comparison, numbers[i+1]);
        }


    }
}
