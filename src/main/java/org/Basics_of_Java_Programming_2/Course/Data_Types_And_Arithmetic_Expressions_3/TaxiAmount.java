package org.Basics_of_Java_Programming_2.Course.Data_Types_And_Arithmetic_Expressions_3;

import java.util.Scanner;

public class TaxiAmount {

    public static void main(String[] args) {
        final double FARE = 8.50;

        int kilometer;
        int initialReadings;
        int finalReadings;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите начальные показания одометра: ");
        initialReadings = input.nextInt();

        System.out.print("Введите конечные показания одометра: ");
        finalReadings = input.nextInt();

        //Конвертировать показания одометра в пройденные км
        kilometer = finalReadings - initialReadings;

        //Отобразить стоимость проезда
        System.out.println("Вы проехали " + kilometer + " км." + "Из расчета " + FARE + " руб. за км, стоимость проезда равна " + FARE * kilometer + " руб.");
    }
}

