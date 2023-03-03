package Homework2part2;
/*
9. Вывести цифры
На вход подается число N.
Необходимо вывести цифры числа слева направо.
Решить задачу нужно через рекурсию.

Ограничение:
0 < N < 1000000
 */
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        leftToRight(N);
    }

    static void leftToRight(int N) {
        int remains = N % 10;
        if (N == 0) {
            return;
        } else {
            leftToRight(N / 10);
        }
        System.out.print(remains + " ");
    }
}