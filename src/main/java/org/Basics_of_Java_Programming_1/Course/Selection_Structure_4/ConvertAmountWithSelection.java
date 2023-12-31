package org.Basics_of_Java_Programming_1.Course.Selection_Structure_4;

import java.util.Scanner;

public class ConvertAmountWithSelection {

    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 72.12;

        int dollars;
        double roubles;
        int digit;

        Scanner input = new Scanner(System.in);

        //Получить сумму денег в американских долларах
        System.out.print("Введите сумму денег в американских долларах: ");
        dollars = input.nextInt();

        // Отобразить сумму денег в американских долларах
        // с правильным окончанием
        System.out.print(dollars);

        if (5 <= dollars && dollars <= 20)
            System.out.print(" американских долларов равны 0");
        else {
            digit = dollars % 10;

            if (digit == 1)
                System.out.print(" американский доллар равен ");
            else if (2 <= digit && digit <= 4)
                System.out.print(" американских доллара равны ");
            else
                System.out.print(" американских долларов равны ");
        }

        //Конвертировать сумму денег в российские рубли
        roubles = ROUBLES_PER_DOLLAR * dollars;

        //Отобразить сумму денег в российских рублях в пользу покупателя
        System.out.println((int)(roubles * 100) / 100.0 + " российского рубля.");
    }
}
