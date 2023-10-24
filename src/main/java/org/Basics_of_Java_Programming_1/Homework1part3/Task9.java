package org.Basics_of_Java_Programming_1.Homework1part3;

import java.util.Scanner;
/*
На вход последовательно подается возрастающая последовательность из n
целых чисел, которая может начинаться с отрицательного числа.
Посчитать и вывести на экран, какое количество отрицательных чисел было
введено в начале последовательности. Помимо этого нужно прекратить
выполнение цикла при получении первого неотрицательного числа на вход.
Ограничения:
0 < n < 1000
-1000 < ai < 1000
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int sum = 0;

        while (true) {
            if (console.nextInt() < 0) {
                sum++;
            } else break;
        }
        System.out.println(sum);
    }
}

