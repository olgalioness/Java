package org.Basics_of_Java_Programming_1.Course.Cycles_6;

import java.util.Scanner;

public class PopulationSize {
    public static void main(String[] args) {

        int n, sum, i;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите n для вычисления суммы 1 + 2 + 3 + ... + n: ");
        n = input.nextInt();

        i = 0;
        sum = 0;
        while (i < n) {
            i = i + 1;
            sum = sum + i;
        }

        System.out.println("Сумма целых чисел от 1 до " + n + " равна " + sum);
        if (sum == (n * (n + 1)) / 2)
            System.out.print("Это эквивалентно ");  // сообщение №1
        else
            System.out.print("Это не эквивалентно ");  // сообщение №2
        System.out.print("(n * (n + 1)) / 2 для n, равного " + n);
    }
}
