package Homework2part2;
/*
3. Шахматы
На вход подается число N — количество строк и столбцов матрицы. Затем передаются координаты X и Y расположения коня на шахматной доске.

Необходимо заполнить матрицу размера NxN нулями, местоположение коня отметить символом K, а позиции, которые он может бить, символом X.

Ограничение:
4 < N < 100
0 <= X, Y < N
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int X = console.nextInt();
        int Y = console.nextInt();

        char[][] Array = new char[N][N];

        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                Array[i][j] = '0';
            }
        }

        Array[Y][X] = 'K';

        if (X - 1 >= 0 && Y - 2 < Array.length) {
            Array[Y - 2][X - 1] = 'X';
        }
        if (X + 1 >= 0 && Y - 2 < Array.length) {
            Array[Y - 2][X + 1] = 'X';
        }
        if (X - 2 >= 0 && Y - 1 < Array.length) {
            Array[Y - 1][X - 2] = 'X';
        }
        if (X + 2 >= 0 && Y - 1 < Array.length) {
            Array[Y - 1][X + 2] = 'X';
        }
        if (X - 2 >= 0 && Y + 1 < Array.length) {
            Array[Y + 1][X - 2] = 'X';
        }
        if (X + 2 >= 0 && Y + 1 < Array.length) {
            Array[Y + 1][X + 2] = 'X';
        }
        if (X - 1 >= 0 && Y + 2 < Array.length) {
            Array[Y + 2][X - 1] = 'X';
        }
        if (X + 1 >= 0 && Y + 2 < Array.length) {
            Array[Y + 2][X + 1] = 'X';
        }

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i][0]);
            for (int j = 1; j < Array[i].length; j++) {
                System.out.print(" " + Array[i][j]);
            }
            System.out.println();
        }
    }
}