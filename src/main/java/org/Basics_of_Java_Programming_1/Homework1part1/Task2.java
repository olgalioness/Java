package org.Basics_of_Java_Programming_1.Homework1part1;
import java.util.Scanner;
/*
На вход подается два целых числа a и b. Вычислите и выведите среднее
квадратическое a и b.
Подсказка:
Среднее квадратическое: https://en.wikipedia.org/wiki/Root_mean_square
Для вычисления квадратного корня воспользуйтесь функцией Math.sqrt(x)

Входные данные:
35 5
23 70
Выходные данные:
25.0
52.100863716449076
 */

public class Task2 {
    public static void main(String[] args) {
        double number1, number2, average;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите два числа, разделенные пробелами: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();

        average = Math.sqrt((Math.pow(number1, 2) + Math.pow(number2, 2)) * 0.5);

        System.out.println("Среднее квадратическое " + number1 + " и " + number2
                + " равно " + average + ".");
    }
}

