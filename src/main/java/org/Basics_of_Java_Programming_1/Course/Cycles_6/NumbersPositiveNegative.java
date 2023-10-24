package org.Basics_of_Java_Programming_1.Course.Cycles_6;

import java.util.Scanner;

public class NumbersPositiveNegative {
    public static void main(String[] args) {
        final int SENTINEL = -99;

        int sum, sum2, score;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите положительное или отрицательное число "
                + SENTINEL + " для выхода: ");
        score = input.nextInt();


        sum = 0;
        sum2 = 0;
        while (score != SENTINEL) {
            if (score >= 0) {
                sum += 1;
            } else if (score < 0){
                sum2 += 1;

            }
            System.out.print("Введите следующее число "
                    + SENTINEL + " для выхода: ");
            score = input.nextInt();
        }

        System.out.println("Количество введенных положительных чисел " + sum);
        System.out.println("Количество введенных отрицательных чисел " + sum2);
    }
}

