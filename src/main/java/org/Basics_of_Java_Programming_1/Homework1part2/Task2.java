package org.Basics_of_Java_Programming_1.Homework1part2;

import java.util.Scanner;
/*
Петя пришел домой и помогает дочке решать математику.
Ей нужно определить, принадлежит ли точка с указанными координатами первому квадранту.
Недолго думая, Петя решил автоматизировать процесс и написать программу: на вход нужно принимать два целых числа (координаты точки), выводить true, когда точка попала в квадрант и false иначе.
Но сначала Петя вспомнил, что точка лежит в первом квадранте тогда, когда её координаты удовлетворяют условию: x > 0 и y > 0.

Ограничение:
-100 < x, y < 100
 */

public class Task2 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите координаты точки: ");
        int x = console.nextInt();
        int y = console.nextInt();

        if ((-100 < x && x < 100) && (-100 < y && y < 100)) {
            boolean c = (x > 0 && y > 0);                            // уже выражение boolean ? true : false;
            System.out.print(c);
            /* if (x > 0 && y > 0) {                                //аналог
                System.out.print("true");
            } else {
                System.out.print("false");
            }*/
        }
    }
}
