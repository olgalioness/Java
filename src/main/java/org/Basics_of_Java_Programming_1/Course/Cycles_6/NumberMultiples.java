package org.Basics_of_Java_Programming_1.Course.Cycles_6;
import java.util.Scanner;

public class NumberMultiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Проверка кратности. Введите пару цифр: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if ((num1 % num2) == 0) {
            System.out.println("Число " + num1 + " кратно числу " + num2);
        } else {
            System.out.println("Число " + num1 + " не кратно числу " + num2);
        }
    }
}

