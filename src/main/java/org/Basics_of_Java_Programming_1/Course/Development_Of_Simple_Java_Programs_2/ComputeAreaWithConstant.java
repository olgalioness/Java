package org.Basics_of_Java_Programming_1.Course.Development_Of_Simple_Java_Programs_2;
/* Вычисление площади круга с использование констант */
import java.util.Scanner; // класс Scanner находится в пакете java.util package

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159; // число Пи

        double radius; // радиус круга
        double area; // площадь круга

        Scanner input = new Scanner(System.in);

        // Получить радиус круга
        System.out.print("Введите радиус круга: ");
        radius = input.nextDouble();

        // Вычислить площадь круга
        area = PI * radius * radius;

        // Отобразить площадь круга
        System.out.println("Площадь круга с радиусом " +
                radius + " равна " + area + ".");
    }
}