package Homework1part3;
/*
Даны положительные натуральные числа m и n.
Найти остаток от деления m на n, не выполняя операцию взятия остатка.

Ограничение:
0 < m, n < 10

38 : 4 = 9          9 * 4 = 36      38 - 36 = 2 (остаток от деления)
38 - (38 : 4) * 4 = остаток от деления
 */
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int m = console.nextInt();
        int n = console.nextInt();

        if ((0 < m && m < 10) && (0 < n && n < 10)) {
            int remains = m - (m / n) * n;
            System.out.println(remains);
        }
    }
}

