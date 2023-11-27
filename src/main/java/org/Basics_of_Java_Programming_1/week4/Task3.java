package org.Basics_of_Java_Programming_1.week4;

import java.util.Scanner;

/*
Даны числа m < 13 и n < 7.
Вывести все степени (от 0 до n включительно) числа m с помощью цикла.
3 6
->
1
3
9
27
81
243
729
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();
        //CASE1
        for (int i = 0; i <= n; i++) {
            System.out.println((int) Math.pow(m, i));
        }
        //case 2
        int res2 = 1;
        System.out.println(res2);                               //вывели res2 чтобы соблюсти m ^ 0 = 1
        for (int i = 1; i <= n; i++) {
            res2 = res2 * m;
            System.out.println(res2);
        }
        //case3;
        int res3 = 1;
        System.out.println(res3);
        int i = 1;
        while (i <= n) {                                                //задать счетчик while
            res3 *= m;
            System.out.println(res3);
            i++;
        }
        //case4
        int res4 = 1;                                                   //цикл с пост условием
        int j = 1;
        do {
            System.out.println(res4);
            res4 *= m;
            j++;
        } while (j <= n + 1);
    }
}
