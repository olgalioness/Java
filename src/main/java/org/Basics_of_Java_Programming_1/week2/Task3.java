package org.Basics_of_Java_Programming_1.week2;

// Дано четырехзначное число. Проверить является ли оно палиндромом.
/*
        Входные данные: 1881
        Выходные данные: true

        Входные данные: 5081
        Выходные данные: false
 */
import java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        if (n > 999 && n < 10000) {
            int end = n % 10;                                   //получчаем последнее число
            int start = n / 1000;                               //получаем первое число
            if (end != start) {                                 //сравним эти числа
                System.out.println("Не палиндром!");
            } else {
                end = (n % 100) / 10;                           //получаем второе число
                start = (n / 100) % 10;                         //получаем третье число

                if (end != start) {                             //сравниваем второе и третье число
                    System.out.println("Не палиндром!");
                } else {
                    System.out.println("Палиндром!");
                }
            }

        } else {
            System.out.println("Ввели неправильное число!");
        }
    }
}

