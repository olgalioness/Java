package Homework2part1;
/*
8.	(1 балл) На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов. После этого передается число M.

Необходимо найти в массиве число, максимально близкое к M (т.е. такое число, для которого |ai - M| минимальное). Если их несколько, то вывести максимальное число.

Ограничения:
0 < N < 100
-1000 < ai < 1000
-1000 < M < 1000
 */
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] ai = new int[N];
        for (int i = 0; i < N; i++) {
            ai[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();

        int res = 0;
        for (int i = 0; i < N - 1; i++) {
            if (Math.abs((ai[i] - M)) >= Math.abs((ai[i + 1] - M))) {
                res = ai[i + 1];
            }
        }
        System.out.println(res);
    }
}
