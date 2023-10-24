package org.Basics_of_Java_Programming_2.Course.Data_Types_And_Arithmetic_Expressions_3.week4;

import java.util.Scanner;

/*
Дана строка s.
Вычислить количество символов в ней,
не считая пробелов (необходимо использовать цикл).

Если не спросишь, никогда не узнаешь.
Result: 32
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                result++;
            }
        }
        System.out.println("Result: " + result);
    }
}
