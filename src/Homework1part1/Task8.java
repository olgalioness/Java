package Homework1part1;

import java.util.Scanner;

/*
На вход подается баланс счета в банке – n.
Рассчитайте дневной бюджет на 30 дней.

Ограничение:
0 < count < 100000
Пример входных данных
13509
Пример выходных данных
450.3
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days = 30;

        int n = console.nextInt();

        if (n > 0) {
            if (n < 100000) {
                double budget = (double) n / days;
                System.out.println(budget);
            }
        }
    }
}