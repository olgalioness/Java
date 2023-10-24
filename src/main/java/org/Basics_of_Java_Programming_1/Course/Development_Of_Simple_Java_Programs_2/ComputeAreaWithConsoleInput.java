package org.Basics_of_Java_Programming_1.Course.Development_Of_Simple_Java_Programs_2;
/* вычисление площади круга */

import java.util.Scanner; // Scanner находится в пакете java.util , java.util.*; импортируются все классы, нет разницы в производительности. использование во время использования класса

public class ComputeAreaWithConsoleInput {
        public static void main(String[] args){
                double radius; // радиус круга
                double area; // площадь круга

                Scanner input = new Scanner(System.in); // создание объекта типа Scanner

                // Получить (от пользователя) радиус круга
                System.out.print("Введите радиус круга: ");
                radius = input.nextDouble();

                // Вычислить площадь круга
                area = 3.14159 * radius * radius;

                // Отобразить площадь круга
                System.out.println("Площадь круга для радиуса " +
                        radius + " равна " + area + ".");
}
    }

//scanner  , system.out устроство вывода, system.in устройство ввода