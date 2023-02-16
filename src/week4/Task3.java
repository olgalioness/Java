package week4;

import java.util.Scanner;

/*
Даны числа m < 13 и n < 7.
Вывести все степени (от 0 до n включительно) числа m с помощью цикла.
3 6
->
1
3
9
27
81
243
729
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int m = console.nextInt();
        int n = console.nextInt();

//        //case1:
//        for (int i = 0; i <= n; i++) {
//            System.out.println((int) Math.pow(m, i));
//        }
//
//        //case2:
//        int res = 1;
//        System.out.println();
//        System.out.println(res);
//        for (int i = 1; i <= n; i++) {
//            res = res * m;
//            System.out.println(res);
//        }

//        //case3:
//        int res = 1;
//        System.out.println(res);
//        int i = 1;
//        while (i <= n) {
//            res *= m;
//            System.out.println(res);
//            i++;
//        }
//
        //case4:
        int res = 1;
        int i = 1;
        do {
            System.out.println(res);
            res *= m;
            i++;
        } while (i <= n + 1);

    }
}
