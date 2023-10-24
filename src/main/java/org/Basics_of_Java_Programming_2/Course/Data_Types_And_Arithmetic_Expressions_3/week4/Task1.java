package org.Basics_of_Java_Programming_2.Course.Data_Types_And_Arithmetic_Expressions_3.week4;

import java.util.Scanner;

/*
Дано число n < 13, n > 0.
Найти факториал числа n (n! = 1 * 2 * 3 * … * (n - 1) * n)

7 -> 5040
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        //case1:
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i; // res = res * i
            System.out.println("Промежуточный результат: " + res);
        }
        System.out.println("\n Итоговый результат: " + res);

        //case2:
        int res2 = 1;
        for (int i = 1; i <= n; i++, res2 *= i) {
            System.out.println(res2);
        }
    }
}
