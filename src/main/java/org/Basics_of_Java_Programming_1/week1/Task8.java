package org.Basics_of_Java_Programming_1.week1;

import java.util.Scanner;
/*
        n - число детей
        k - число конфет

        1. Вывести сколько конфет достанется каждому ребенку, если стараться делить их поровну
        2. Вывести сколько конфет останется взрослым после выдачи конфет детям

        (1) Входные данные: 5 3
        (2) Входные данные: 3 17

 */

public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите количество детей: ");
        int n = console.nextInt();
        System.out.print("Введите количество конфет: ");
        int k = console.nextInt();

        System.out.println("------------------------------------------");
        System.out.println("Всего раздали конфет: " + k / n * n + " шт");
        System.out.println("Каждому ребенку по: " + k / n + " шт");
        System.out.println("Осталось конфет для взрослых: " + k % n + " шт");
    }
}
