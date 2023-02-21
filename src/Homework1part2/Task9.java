package Homework1part2;

import java.util.Scanner;
/*
Пока Петя практиковался в работе со строками, к нему подбежала его дочь и спросила: "А правда ли, что тригонометрическое тождество (sin^2(x)+ cos^2(x) - 1 == 0) всегда-всегда выполняется?"
Напишите программу, которая проверяет, что при любом x на входе тригонометрическое тождество будет выполняться (то есть будет выводить true при любом x).

Ограничение:
-1000 < x < 1000
Пример входных данных
90
Пример выходных данных
true
 */
public class Task9 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double x = console.nextDouble();
        if (-1000 < x && x < 1000) {
            if ((int) (Math.pow(Math.sin(x), 2) + Math.pow(Math.cos(x), 2)) - 1 == 0) {
                System.out.println("true");
            }
        } else {
            System.out.println("false");
        }
    }
}

