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
        int n = console.nextInt();                              //считываем длинну массива
        boolean result = true;

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();
        }
        /*
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[i + 1]) {                       //если предыдущий элемент меньше текущего
                result = false;
                break;
            }
        }
        System.out.println(result);
         */
        System.out.println(checkIfArrayDesc(arr));
    }

    public static boolean checkIfArrayDesc(int[] inputArray) {               //метод выходного значени = возвращает boolean, void - что-то делает, но ничего не возвращает
        for (int i = 0; i < inputArray.length - 1; i++) {                    //объявили в методе параметры для входных данных. входные данные передается массив
            if (inputArray[i] <= inputArray[i + 1]) {                        //предыдущий элемент массива меньше или равен текущему
                return false;                                                //возвращаем false
            }
        }
        return true;
    }
}
