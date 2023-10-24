package org.Basics_of_Java_Programming_1.Course.Cycles_6;

import java.util.Scanner;

public class MultiplicityOfTheNumber {

    public static void main(String[] args) {

        int t,n;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        t = input.nextInt();
        System.out.print("Введите второе число: ");
        n = input.nextInt();

        while ((t % n) != 0){


            System.out.println("Первое число " + t + " не кратно Второму числу " +  n);
            System.out.println("Введите первое число: ");
            t = input.nextInt();
            System.out.println("Введите второе число: ");
            n = input.nextInt();
        }
        System.out.println("Первое число " + t + " кратно Второму числу " +  n);
    }
}
