package org.Basics_of_Java_Programming_1.Course.Selection_Structure_4;

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);

        // Получить целое число
        System.out.print("Введите целое число: ");
        number = input.nextInt();

        // Определить делимость на 2 и/или на 3

        if (number % 2 == 0 && number % 3 == 0)
            System.out.println(number + " делится нацело на 2 и на 3.");

        if (number % 2 == 0 || number % 3 == 0)
            System.out.println(number + " делится нацело на 2 или на 3.");

        if (number % 2 == 0 ^ number % 3 == 0)
            System.out.println(number +
                    " делится нацело на 2 или на 3, но не на оба.");
    }
}