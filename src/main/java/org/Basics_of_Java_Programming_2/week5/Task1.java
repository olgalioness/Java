package week5;

import java.util.Scanner;

/*
 На вход подается число N — длина массива.
 Затем передается массив целых чисел длины N.

  Вывести все четные элементы массива.
  Если таких элементов нет, вывести -1.

5
1 2 3 4 5
->
2 4
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();                           //считали длинну массива, получили размер массива
        //при инициализации массива, нельзя изменять длину массива

        int[] arr = new int[n];                             //записали длинну массива
        for (int i = 0; i < n; i++) {                        //заполнили массив входными данными
            arr[i] = console.nextInt();
        }
        boolean flag = false;                               //нет четных элементов массива, вывести -1

        for (int i = 0; i < n; i++) {                      //пройтись по эелментам массива проверить и вывести
            if (arr[i] % 2 == 0) {                         //если элемент делится без остатка то выводим
                System.out.println("Элемент: " + arr[i]);
                flag = true;                               //сбросили флаг
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}