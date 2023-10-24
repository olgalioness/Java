package org.Basics_of_Java_Programming_1.Homework1part3;
/*
1. Таблица умножения
Напечатать таблицу умножения от 1 до 9.
Входных данных нет.
Многоточие в примере ниже подразумевает вывод таблицы умножения и для остальных чисел 2, 3 и т. д.
 */

public class Task1 {
    public static void main(String[] args) {
        int number1 = 1;
        int number2;
        while (number1 <= 9) {
            number2 = 1;
            while (number2 <= 9) {
                System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
                number2++;
            }
            number1++;
        }
    }
}






