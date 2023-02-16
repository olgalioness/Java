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
        int n = console.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i< n; i++){
            arr[i] = console.nextInt();         //считали массив

        }
        boolean flag = false;               //нет четных элементов

        for (int i=0; i<n; i++){            //если элемент четный проверили и вывели в консоль
            if(arr[i] % 2 == 0){
                System.out.println("Элемент: " + arr[i]);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println(-1);
        }
    }
}
