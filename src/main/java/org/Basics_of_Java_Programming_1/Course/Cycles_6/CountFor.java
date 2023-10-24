package org.Basics_of_Java_Programming_1.Course.Cycles_6;

import java.util.Scanner;

public class CountFor {
    public static void main(String[] args) {
        int count_emp;

        int number_emp = 3;
        double total_pay = 0.0;
        for (count_emp = 0;          // инициализация
             count_emp < number_emp; // проверка условия
             ++count_emp) {          // обновление
            Scanner input = new Scanner(System.in);
            System.out.print("Введите отработанные часы: ");
            double hours = input.nextDouble();
            System.out.print("Введите часовую ставку в рублях: ");
            double rate = input.nextDouble();
            double pay = hours * rate;
            System.out.println("Зарплата равна " + pay + " руб.");
            total_pay += pay;
        }
        System.out.println("\nВсе сотрудники обработаны.\n");
    }
}
