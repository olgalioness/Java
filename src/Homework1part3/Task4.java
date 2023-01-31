package Homework1part3;

import java.util.Scanner;
/*
4. Цифры в столбик
Дано натуральное число n. Вывести его цифры в "столбик".

Ограничение:
0 < n < 1000000
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int first, second, third, fourth, fifth, sixth;

        int n = console.nextInt();

        if (0 < n && n <= 9) {
            first = n % 10;
            System.out.println(first);
        } else if (10 <= n && n <= 99) {
            first = n / 10;
            second = n % 10;
            System.out.println(first);
            System.out.println(second);
        } else if (100 <= n && n <= 999) {
            first = n / 100;
            second = (n % 100) / 10;
            third = (n % 100) % 10;
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
        } else if (1000 <= n && n <= 9999){
            first = n / 1000;
            second = (n % 1000) / 100;
            third = ((n % 1000) % 100) / 10 ;
            fourth = ((n % 1000) % 100)  % 10;
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(fourth);
        } else if (10000 <= n && n <= 99999) {
            first = n / 10000;
            second = (n % 10000) / 1000;
            third = ((n % 10000) % 1000) / 100;
            fourth = (((n % 10000) % 1000) % 100) / 10;
            fifth = (((n % 10000) % 1000) % 100) % 10;
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(fourth);
            System.out.println(fifth);
        } else if (100000 <= n && n < 1000000) {
            first = n / 100000;
            second = (n % 100000) / 10000;
            third = ((n % 100000) % 10000) / 1000;
            fourth = (((n % 100000) % 10000) % 1000) / 100;
            fifth = ((((n % 100000) % 10000) % 1000) % 100) / 10;
            sixth = ((((n % 100000) % 10000) % 1000) % 100) % 10;
            System.out.println(first);
            System.out.println(second);
            System.out.println(third);
            System.out.println(fourth);
            System.out.println(fifth);
            System.out.println(sixth);
        }
    }
}

