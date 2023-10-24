package org.Basics_of_Java_Programming_1.week1;

import java.util.Scanner;
/* Перевод литров в галлоны. С консоли считывается число n –  количество литров, которое нужно перевести в галлоны.
    (1 литр = 0,219969 галлонна)
*/

public class Task10 {
    private static final double GALLON_TO_GALLONE = 0.219969;

    public static void main(String[] args){
    // final double GALLON_TO_GALLONE = 0.219969;               //объявление константы в методе
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println("Введено: " + n + " литров -> это " + n * GALLON_TO_GALLONE + " галлонов.");
    }
}
