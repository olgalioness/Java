package org.Basics_of_Java_Programming_1.Homework1part3;

import java.util.Scanner;
/*
10. Елочка
Вывести на экран "ёлочку" из символа решетки (#) заданной высоты N.
На N + 1 строке у "ёлочки" должен быть отображен ствол из символа |

Ограничение:
2 < n < 10
 */
public class Task10 {
    public static void main(String[] args) {
        int n;
        Scanner console = new Scanner(System.in);

        n = console.nextInt();

        if (0 < n && n < 10) {
            for (int i = 0; i < n; i++) {
                for (int x = 1; x < n - i; x++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i * 2 + 1; j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            for (int j = 1; j < n; j++) {
                System.out.print(" ");
            }
            System.out.print("|");
        }
    }
}


