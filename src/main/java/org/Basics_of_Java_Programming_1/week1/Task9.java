package org.Basics_of_Java_Programming_1.week1;

import java.util.Scanner;
/*
        Решение квадратного уравнения. ax^2+bx+c=0,
        Даны целые числа a, b и с, определяющие квадратное уравнение.
        Вычислить корни уравнения.
        Гарантируется, что в тестовых данных у всех уравнений есть решение и их два.

        Входные данные
        a = 9 b = -96 с = 30
        Выходные данные
        x1 = 0.322 x2 = 10.344
 */
//Теорема Виетта через цикл
//ax^2 + bx + c = 0
//через дискременант d = b^2 - 4ac

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        double d = Math.pow(b, 2) - 4 * a * c;              //дискриминант  b^2 - 4ac, если d>0, то уравнение имеет два квадратных корня
        double x1 = (-b + Math.sqrt(d)) / (2 * a);          //x=(-b+корень из d)/2a, x=(-b-корень из d)/2a
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);
    }
}
