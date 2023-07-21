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
public class Task4part2 {
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
        mergeTwoArraysWithLoop(arr1, arr2);
    }
    public static void mergeTwoArraysWithLoop(int[] arr1, int[] arr2){          //java doc метод слияние двух атсортированных массива в третий результирующий
        int[] mergedArray = new int[arr1.length + arr2.length];                 //инициализация длинны массивов слияние
        int pos = 0;                                                            //копировать элементы позиции

        for (int element : arr1){                                               //foreach копируем элементы первого массива в результирующий
            mergedArray[pos] = element;                                         //пробежали по элементам первого массива и заполнили в mergedArray
            pos++;
        }
        for (int element : arr2){
            mergedArray[pos] = element;
            pos++;
        }
        Arrays.sort(mergedArray);                                                //сортировка массива, метод void, статический класс  и массив видоизменен
        System.out.println(Arrays.toString(mergedArray));                        //вывести на экран массив, чтобы не бежать циклом for
    }
}

