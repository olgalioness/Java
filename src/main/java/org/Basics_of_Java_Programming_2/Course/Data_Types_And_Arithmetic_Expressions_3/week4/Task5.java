package org.Basics_of_Java_Programming_2.Course.Data_Types_And_Arithmetic_Expressions_3.week4;

import java.util.Scanner;

/*
  Дано целое число n, n > 0. Вывести сумму всех цифр этого числа.
  92180 -> 20 //9 + 2 + 1 + 8 + 0 == 20
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println("Входные данные: n = " + n);
        System.out.println("Выходные данные: ");

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            System.out.println("SUM in WHILE LOOP: " + sum);

            n = n / 10;
            System.out.println("N in WHILE LOOP : " + n);
        }
        System.out.println("Answer: " + sum);

        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int m = scanner.nextInt(); m != 0; m /=  10) {
            total += (m % 10);
        }
        System.out.println("total: " + total);
    }

}