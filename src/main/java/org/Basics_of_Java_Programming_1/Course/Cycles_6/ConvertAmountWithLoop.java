package org.Basics_of_Java_Programming_1.Course.Cycles_6;

import java.util.Scanner;

public class ConvertAmountWithLoop {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12; // курс покупки

        int dollars;
        double roubles;
        int digit;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите сумму денег в американских долларах: ");
        dollars = input.nextInt();

        System.out.print(dollars);      //отобразить сумму денег в долларах

        if(5 <= dollars && dollars <= 20)
            System.out.println(" американских долларов равны ");
        else {
            digit = dollars % 10;

            if(digit == 1)
                System.out.println(" американский доллар равен ");
            else if(2 <= digit && digit <= 4)
                System.out.println(" американских доллара равны ");
            else
                System.out.println(" американских долларов равны");
        }
        roubles = ROUBLES_PER_DOLLAR * dollars;

        System.out.println((int)(roubles * 100) / 100.0 + " российского рубля.");
    }
}
