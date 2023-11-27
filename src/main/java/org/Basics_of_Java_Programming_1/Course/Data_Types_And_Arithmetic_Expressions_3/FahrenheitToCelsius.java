package org.Basics_of_Java_Programming_1.Course.Data_Types_And_Arithmetic_Expressions_3;
/*Программа преобразует температуру из градусов по шкале Фаренгейта в градусы по шкале Цельсия*/
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        double fahrenheit, celsius;

        Scanner input = new Scanner(System.in);

        // Получить температуру в градусах по шкале Фаренгейта
        System.out.print("Введите температуру в градусах по шкале Фаренгейта: ");
        fahrenheit = input.nextDouble();

        // Преобразовать температуру в градусы по шкале Цельсия
        celsius = (5.0 / 9) * (fahrenheit - 32);

        // Отобразить температуру в градусах по шкале Цельсия
        System.out.println(fahrenheit + " градуса по шкале Фаренгейта равно " +
                celsius + " градуса по шкале Цельсия.");
    }
}