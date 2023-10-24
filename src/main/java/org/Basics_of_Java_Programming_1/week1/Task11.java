package org.Basics_of_Java_Programming_1.week1;

import java.util.Scanner;
/*Дано целое число n. Выведите следующее за ним четное число.
  При решении этой задачи нельзя использовать условную инструкцию if и циклы.
    5->6
    10 ->12
 */

public class Task11 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println(n + 2 - Math.abs(n) % 2);
        //модуль числа n и получим остаток от деления  5%2=1   =>5+2-1=6,   10%2=0 => 10+2-0=12
    }
}
