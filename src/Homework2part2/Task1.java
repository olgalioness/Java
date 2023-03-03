package Homework2part2;

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

