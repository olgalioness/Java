package week5;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = console.nextInt();         //массив начинается 0
        }
       for (int i = 0; i < n; i++) {
           if (i % 2 == 0) {
               System.out.println("i = " + i + " элемент = " + arr[i]); //если индекс массива четный выводим массив
           }
      //      for (int i = 0; i<n; i = i +2){
       //         System.out.println("i = " + i + " элемент = " + arr[i]);
        //    }
        }
    }
}
//for (int i = 0; i < n; i = i + 2) {
//            System.out.println(arr[i] + " ");
//        }


