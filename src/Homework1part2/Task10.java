package Homework1part2;

import java.util.Scanner;
/*
"А логарифмическое?" - не унималась дочь.

Ограничение:
-500 < n < 500
 */
public class Task10 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double n = console.nextDouble();
        if (-500 < n && n < 500) {
            if (Math.log(Math.pow(Math.E, n)) == n) {
                System.out.println("true");
            }
        } else {
            System.out.println("false");
        }
    }
}

