package org.Basics_of_Java_Programming_1.Course.Development_Of_Simple_Java_Programs_2;
/*вычисляет среднее геометрическое трех вещественных чисел */
import java.util.Scanner;

public class ComputeTheGeometricMean {
    public static void main(String[] args) {
        double number1, number2, number3, average, average2; // объявление переменных

        Scanner input = new Scanner(System.in); // создание объекта типа Scanner

        // Получить три числа
        System.out.print("Введите три числа, разделенные пробелами: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();

        // Вычислить среднее арифметическое трех чисел
        average = Math.cbrt(number1 * number2 * number3);
        average2 = Math.pow(number1 * number2 * number3, 1./3);     //возведение в степень

        // Отобразить среднее арифметическое трех чисел
        System.out.println("Среднее геометрическое " + number1 + " " + number2
                + " " + number3 + " равно " + average + ".");
        System.out.println(average2);
    }
}

