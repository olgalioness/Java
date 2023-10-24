package org.Basics_of_Java_Programming_1.Homework1part1;
import java.util.Scanner;
/*
Переведите дюймы в сантиметры (1 дюйм = 2,54 сантиметров).
На вход подается количество дюймов count, выведите количество сантиметров.

Ограничения:
0 < count < 1000
 */

public class Task5 {
    private static final double INCH_TO_CENTIMETER = 2.54;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int count = console.nextInt();

        if (count > 0) {
            if (count < 1000) {
                double centimeter = count * INCH_TO_CENTIMETER;

                System.out.println(centimeter);
            }
        }
    }
}