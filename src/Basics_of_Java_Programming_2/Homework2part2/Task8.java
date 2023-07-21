package Homework2part2;
/*
8. Сумма цифр
На вход подается число N.
Необходимо посчитать и вывести на экран сумму его цифр.
Решить задачу нужно через рекурсию.

Ограничение:
0 < N < 1000000
 */
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(Sum(N));
    }

    public static int Sum(int N) {
        if (N < 10) {
            return N;
        }
        return N % 10 + Sum(N / 10);
    }
}

