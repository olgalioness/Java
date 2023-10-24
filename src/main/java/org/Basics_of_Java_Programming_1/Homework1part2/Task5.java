package org.Basics_of_Java_Programming_1.Homework1part2;

import java.util.Scanner;
/*
5.Дома дочери Пети опять нужна помощь с математикой! В этот раз ей нужно проверить, имеет ли предложенное квадратное уравнение решение или нет.

На вход подаются три числа — коэффициенты квадратного уравнения a, b, c. Нужно вывести "Решение есть", если оно есть и "Решения нет", если нет.

	Ограничения:
-100 < a, b, c < 100

 */
public class Task5 {
    public static void main(String[] args) {
        double x1, x2;

        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if ((-100 < a && a < 100) && (-100 < b && b < 100) && (-100 < c && c < 100)) {
            double root = Math.pow(b, 2) - 4 * a * c;

            if (root > 0) {
                x1 = (-b + Math.sqrt(root)) / (2 * a);
                x2 = (-b - Math.sqrt(root)) / (2 * a);
                System.out.println("Решение есть");
            } else if (root == 0) {
                x1 = (-b) / (2.0 * a);
            } else {
                System.out.println("Решения нет");
            }
        }
    }
}

