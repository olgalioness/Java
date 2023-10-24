package org.Basics_of_Java_Programming_1.Homework1part3;

import java.util.Scanner;
/*
На вход подается:
○ целое число n,
○ целое число p
○ целые числа a1, a2 , … an
Необходимо вычислить сумму всех чисел a1, a2, a3 … an которые строго
больше p.
Ограничения:
0 < m, n, ai < 1000
 */
public class Task8 {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int p = console.nextInt();

        int sum = 0;
        int temp = 0;
        if ((0 < n && n < 1000) && (0 < p && p < 1000)) {
            for (int i = 1; i <= n; i++) {
                temp = console.nextInt();
                if (temp > p)
                    sum += temp;
            }
            System.out.println(sum);
        }
    }
}

