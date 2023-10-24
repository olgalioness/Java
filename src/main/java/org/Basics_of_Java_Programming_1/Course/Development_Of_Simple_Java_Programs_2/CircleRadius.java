
package org.Basics_of_Java_Programming_1.Course.Development_Of_Simple_Java_Programs_2;

import java.util.Scanner;
/* Вычисление длины окружности */

public class CircleRadius {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Введите радиус: ");

        double radius = console.nextDouble();
        double area = Math.PI * (radius * radius);

        System.out.println("Длинна окружности равна: " + area);
    }
}
