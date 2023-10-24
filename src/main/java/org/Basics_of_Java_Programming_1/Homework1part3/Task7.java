package org.Basics_of_Java_Programming_1.Homework1part3;

import java.util.Scanner;

/*
Дана строка s.
Вычислить количество символов в ней, не считая пробелов (необходимо использовать цикл).

Ограничение:
0 < s.length() < 1000
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        if (0 < s.length() && s.length() < 1000) {
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ')
                    sum += 0;
                else
                    sum += 1;
            }
            System.out.println(sum);
        }
    }
}


