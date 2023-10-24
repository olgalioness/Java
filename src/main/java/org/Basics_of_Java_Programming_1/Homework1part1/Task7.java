package org.Basics_of_Java_Programming_1.Homework1part1;

import java.util.Scanner;

/*
На вход подается двузначное число n.
Выведите число, полученное перестановкой цифр в исходном числе n.
Если после перестановки получается ведущий 0, его также надо вывести.
Пример входных данных
45
Пример выходных данных
54
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int first = n / 10;
        int second = n % 10;

        System.out.println(second+""+first);
    }
}

