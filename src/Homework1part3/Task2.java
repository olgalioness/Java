package Homework1part3;

import java.util.Scanner;

/*
2. Сумма чисел
На вход подается два положительных числа m и n.
Найти сумму чисел между m и n включительно.

Ограничение:
0 < m, n < 10
m < n
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int m = console.nextInt();
        int n = console.nextInt();

        if ((0 < m && m < 10) && (0 < n && n < 10) && (m < n)) {
            int sum = 0;
            for (int i = m; i <= n; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}

