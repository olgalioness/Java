package org.Basics_of_Java_Programming_1.week1;
import java.util.Scanner;
/*
Дано m – количество гигабайт трафика, используемое пользователем за месяц, с – заплаченная цена за этот трафик.
        Вычислить стоимость одного гигабайта трафика. c/m
        Ограничения:
        0 < m < 100
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество гигабайт трафика:");
        int m = console.nextInt();
        System.out.println("Введите стоимость трафика:");
        int c = console.nextInt();

        if (0 < m && m < 100) {
            System.out.println("Стоимость одного гигабайта трафика равна " + (double) c / m);      //пропадет остаток от деления, привести к double
        }
    }
}
//Scanner console = new Scanner("3 2 1");               //задать входные данные





