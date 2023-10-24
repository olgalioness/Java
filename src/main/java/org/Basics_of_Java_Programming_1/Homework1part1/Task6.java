package org.Basics_of_Java_Programming_1.Homework1part1;

import java.util.Scanner;

/*
На вход подается количество километров count.
Переведите километры в мили (1 миля = 1,60934 км) и выведите количество миль.

Ограничения:
0 < count < 1000

Пример входных данных
7
Пример выходных данных
4.349609156548647
 */
public class Task6 {
    private static final double MILES_TO_KILOMETERS = 1.60934;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int count = console.nextInt();

        if (count > 0) {
            if (count < 1000) {
                double kilometers = count / MILES_TO_KILOMETERS;
                System.out.println(kilometers);
            }
        }
    }
}
