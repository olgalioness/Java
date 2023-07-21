package Homework2part1;
/*
Возведение в квадрат
На вход подается число N — длина массива.
Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.

Необходимо создать массив, полученный из исходного возведением в квадрат каждого элемента, упорядочить элементы по возрастанию и вывести их на экран.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }


        int[] mergedArray = new int[N];
        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                mergedArray[j] = (int) Math.pow(arr[j], 2);
            }
        }

        Arrays.sort(mergedArray);

        for (int k = 0; k < mergedArray.length; k++) {
            System.out.print(mergedArray[k] + " ");
        }
    }
}


