package Homework1part2;

import java.util.Scanner;
/*
После вкусного обеда Петя принимается за подсчет дней до выходных.
Календаря под рукой не оказалось, а если спросить у коллеги Феди, то тот называет только порядковый номер дня недели, что не очень удобно.
Поэтому Петя решил написать программу, которая по порядковому номеру дня недели выводит сколько осталось дней до субботы.
А если же сегодня шестой (суббота) или седьмой (воскресенье) день, то программа выводит "Ура, выходные!"

Ограничение:
1 <= n <= 7
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите порядковый номер дня недели ");
        int n = console.nextInt();

        if ((1 <= n && n <= 7)) {
            if (n < 6) {
                int x = 6 - n;
                System.out.print("Осталось дней до субботы: " + x);
            } else {
                System.out.print("Ура, выходные!");
            }
        }
    }
}
