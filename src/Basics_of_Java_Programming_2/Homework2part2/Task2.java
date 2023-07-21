package Homework2part2;
/*
2. Нарисовать прямоугольник
На вход подается число N — количество строк и столбцов матрицы.
Затем в последующих двух строках подаются координаты X (номер столбца) и Y (номер строки) точек, которые задают прямоугольник.

Необходимо отобразить прямоугольник с помощью символа 1 в матрице, заполненной нулями (см. пример) и вывести всю матрицу на экран.

Ограничение:
0 < N < 100
0 <= X1, Y1, X2, Y2 < N
X1 < X2
Y1 < Y2
 */
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X1 = input.nextInt();
        int Y1 = input.nextInt();
        int X2 = input.nextInt();
        int Y2 = input.nextInt();

        int[][] Array = new int[N][N];

        for (int i = Y1 + 1; i < Y2; i++) {
            Array[i][X1] = 1;
            Array[i][X2] = 1;
        }
        for (int i = X1; i <= X2; i++) {
            Array[Y1][i] = 1;
        }
        for (int i = X1; i <= X2; i++) {
            Array[Y2][i] = 1;
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

