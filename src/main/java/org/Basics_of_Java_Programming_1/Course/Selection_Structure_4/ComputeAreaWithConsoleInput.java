package org.Basics_of_Java_Programming_1.Course.Selection_Structure_4;

import java.util.Scanner; // Scanner находится в пакете java.util

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        double radius; // радиус круга
        double area; // площадь круга

        Scanner input = new Scanner(System.in); // создание объекта типа Scanner

        // Получить (от пользователя) радиус круга
        System.out.print("Введите радиус круга: ");
        radius = input.nextDouble();

        if (radius < 0) {
            System.out.println("Некорректные входные данные.");
        } else {
            // Вычислить площадь круга
            area = 3.14159 * radius * radius;
            // Отобразить площадь круга
            System.out.println("Площадь круга для радиуса " +
                    radius + " равна " + area + ".");
        }
    }
}