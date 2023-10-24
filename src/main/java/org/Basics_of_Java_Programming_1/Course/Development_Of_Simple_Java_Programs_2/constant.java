package org.Basics_of_Java_Programming_1.Course.Development_Of_Simple_Java_Programs_2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class constant {
    public static void main(String[] args) {
        final double PI = 3.14159;

       double radius;
        double area;
        Scanner console = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        radius = console.nextDouble();

        area = radius*radius*PI;                        //Площадь круга с радиусом
        System.out.println("Площадь круга равна " + area);
    }
}
