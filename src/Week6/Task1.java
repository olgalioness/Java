package Week6;
/*
На вход передается N — высота двумерного массива и M — его ширина.
Затем передается сам массив.
Необходимо сохранить в одномерном массиве суммы чисел каждого столбца и вывести их на экран.
Пример:
Входные данные
2 2
10 20
5 7
Выходные данные
15 27
Входные данные
3 1
30
42
15
Выходные данные
87
*/

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();

        //заполнение массива
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {         //i внешний цикл
            for (int j = 0; j < m; j++) {     //j внутренний массив
                array[i][j] = input.nextInt();
            }
        }
        //почитать суммы столбцов нужен отдельный одномерный массив
        int[] res = new int[m];
        //подсчет ссуммы, пройтись двойным циклом по массиву
        for (int i = 0; i < m; i++) {                           //бежим по количеству столбцов 2 10 5 2 20 7
            for (int j = 0; j < n; j++) {                       //просумировали внешний цикл столбец 2+10   [12][22] внешний цикл 2+20
                res[i]  += array[j][i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}