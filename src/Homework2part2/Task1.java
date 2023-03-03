package Homework2part2;
/*
1. Минимальный элемент
На вход передается N — количество столбцов в двумерном массиве и M — количество строк.
Затем сам передается двумерный массив, состоящий из натуральных чисел.

Необходимо сохранить в одномерном массиве и вывести на экран минимальный элемент каждой строки.

Ограничение:
0 < N < 100
0 < M < 100
0 < ai < 1000
 */
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] arr = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int[] arr2 = new int[M];

        for (int i = 0; i < M; i++) {
            arr2[i] = arr[i][0];
            for (int j = 0; j < N; j++) {
                if (arr[i][j] < arr2[i]) {
                    arr2[i] = arr[i][j];
                }
            }
        }
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }
    }
}

