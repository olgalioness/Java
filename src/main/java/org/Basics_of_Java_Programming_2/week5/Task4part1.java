package week5;

import java.util.Arrays;
import java.util.Scanner;

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
public class Task4part1 {
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
        mergeTwoArraysWithSystemArrayCopy(arr1, arr2);
    }
        public static void mergeTwoArraysWithSystemArrayCopy(int[] arr1, int[] arr2){
            int[] mergedArray = new int[arr1.length + arr2.length];                       //задаем результирующей массив
            System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);        //копируем 1 массив с 0 позиции в результирующий, в 0 позиции, копируем кол-во элементов 1 массива
            System.arraycopy(arr2, 0 , mergedArray, arr1.length, arr2.length);     //копируем 2 массив с 0 позиции в результирующий, в позицию - destpos (дестинейшен) -сдвигаем на длинну первого массива, кол-во эл второго массива.

            Arrays.sort(mergedArray);                                                     //сортировка массива, метод void, статический класс  и массив видоизменен
            System.out.println(Arrays.toString(mergedArray));                            //вывести на экран массив, чтобы не бежать циклом for
        }
}
