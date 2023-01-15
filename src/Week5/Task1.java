package Week5;

import java.util.Scanner;

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
