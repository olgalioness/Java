package week5;
/*
   На вход подается два отсортированных массива.
   Нужно создать отсортированный третий массив,
   состоящий из элементов первых двух.

   Входные данные:
   5
   1 2 3 4 7

   2
   1 6

   Выходные данные:
   1 1 2 3 4 6 7
    */

import java.util.Arrays;
import java.util.Scanner;

public class Task4part3 {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = console.nextInt();
        }

        int k = console.nextInt();
        int[] arr2 = new int[k];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = console.nextInt();
        }
        mergeTwoArrays(arr1, arr2);
    }

    public static void mergeTwoArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];                    //объявляем результирующий массив
        int i = 0, j = 0, k = 0;                                                   //нужно 3 обхода, cчетчики i для arr1, j для arr2, k для arr3

        //обход двух массивов
        while (i < arr1.length && j < arr2.length) {                               //пока i меньше длинны arr1 и j меньше длинны arr2
            if (arr1[i] < arr2[j]) {                                               //если arr1 будет меньше arr2, бежим по элементам первого и второго массив
                mergedArray[k++] = arr1[i++];                                      //разместить элемент первого массива в результирующий массив
            } else {                                                               //записываем на k элемент первого массива и счетчик увеличили.
                mergedArray[k++] = arr2[j++];                                       //в ином случае записываем в результирующий на позицию k и увеличиваем элемент второго массива
                //сдвигаем счетчик относительно первого или второго массива

            }
        }
        //если в переборку не попали элементы первого массива сохраняем оставшиеся в результирующий
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        //если в переборку не попали элементы второго массива сохраняем оставшиеся в результирующий
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        System.out.println(Arrays.toString(mergedArray));                        //вывести на экран массив, чтобы не бежать циклом for
    }
}
//сортирует не корректно
/*
   7
   1 2 3 4 7 11 10
   4
   1 6 9 8
 */
//тернарником можно пройтись по остальным элементам
