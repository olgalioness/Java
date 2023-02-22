package Homework2part1;
import java.util.Scanner;
/*
1. Посчитать среднее арифметическое
На вход подается число N — длина массива.
Затем передается массив вещественных чисел (ai) из N элементов.


Необходимо реализовать метод, который принимает на вход полученный массив и возвращает среднее арифметическое всех чисел массива.
Вывести среднее арифметическое на экран.

Ограничение:
0 < N < 100
0 < ai < 1000
 */

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double[] arr = new double[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextDouble();
        }
        arithmeticMean(arr);
    }
    public static void arithmeticMean(double[] array) {
        double sum = 0;
        for (double element : array) {
            sum += element;
        }
        System.out.println(sum / array.length);
    }
}
//case2
//        for (int i = 0; i < arr.length; i++) {
//        }
//        double sum = 0;
//        for (int i = 0; i < arr.length; i++) {                //корректней циклом foreach
//            sum += arr[i];
//        }
//        System.out.println(sum / N);                          //корректней на длинну массива
//    }
//}
//case3
//System.out.println(arithmeticMean(arr));                      //вызвать возвращающий метод
//    public static double arithmeticMean(double[] array) {
//        double sum = 0;
//        for (double element : array) {
//            sum += element / array.length;
//        }
//        return(sum);

