package week5;

import java.util.Scanner;

/*
На вход подается число N — длина массива.
Затем передается массив целых чисел длины N.

Проверить, является ли он отсортированным массивом строго по убыванию.
Если да, вывести true, иначе вывести false.

5
5 4 3 2 1
->
true

2
43 46
->
false

3
5 5 5
->
false
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        boolean result = true;                  //не используется
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }

        //   for (int i = 0; i < n-1; i++){
        //         if (arr[i] <= arr[i +1]) {              //отсортирован ли он строко по убыванию
        //              result = false;
        //              break;
        //           }                                       //ctrl + shift + /

        //      }
        System.out.println(checkIfArrayDesc(arr));
    }

    public static boolean checkIfArrayDesc(int[] inputArray) {           //модификатор доступа к методу void - ничего не возвращает     boolean -выходное значение вернет результат
        for (int i = 0; i < inputArray.length - 1; i++) {              //длинна массива на выход, -1 чтобы не вылететь за границы
            if (inputArray[i] <= inputArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

