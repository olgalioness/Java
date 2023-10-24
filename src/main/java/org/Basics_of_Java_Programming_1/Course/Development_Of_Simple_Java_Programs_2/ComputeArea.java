package org.Basics_of_Java_Programming_1.Course.Development_Of_Simple_Java_Programs_2;
/* Вычисление площади круга*/

public class ComputeArea {
    public static void main(String[] args) {
        double radius; // радиус круга - объявление переменной
        double area; // площадь круга - объявление переменной

        // Получить радиус круга
        radius = 20; // радиус круга - присвоение значения

        // Вычислить площадь круга
        area = 3.14159 * radius * radius;

        // Отобразить площадь круга
        System.out.println("Площадь круга с радиусом " +
                radius + " равна " + area + ".");
    }
}
//Значение переменной не определено до тех пор, пока оно не будет ей присвоено.
//+ оператором конкатенации строк