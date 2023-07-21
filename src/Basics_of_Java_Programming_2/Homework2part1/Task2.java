package Homework2part1;
import java.util.Arrays;
import java.util.Scanner;
/*
4. Количество различных элементов
На вход подается число N — длина массива.
Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.

Необходимо вывести на экран построчно сколько встретилось различных элементов.
Каждая строка должна содержать количество элементов и сам элемент через пробел.

Ограничение:
0 < N < 100
-1000 < ai < 1000
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] arr1 = new int[N];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = console.nextInt();
        }

        int M = console.nextInt();
        int[] arr2 = new int[M];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = console.nextInt();
        }
        System.out.println(Arrays.equals(arr1, arr2));                  //сравнение массивов
    }
}