package Week6;
/*
На вход подается число N — ширина и высота матрицы.
Необходимо заполнить матрицу 1 и 0 в виде шахматной доски.
Нулевой элемент должен быть 0.

Входные данные
3
Выходные данные
0 1 0
1 0 1
0 1 0

Входные данные
4
Выходные данные
0 1 0 1
1 0 1 0
0 1 0 1
1 0 1 0
   */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //заполнение массива
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {                       //изначально заполнен 0 0
            for (int j = 0; j < n; j++) {
                //если сумма индексов без остака делиться на 2 то заполняем 0, если остаток 1, заполняется 1
                if ((i + j) % 2 == 0){
                    a[i][j] = 0;
                } else {
                    a[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}