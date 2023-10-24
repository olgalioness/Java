package org.Basics_of_Java_Programming_2.Course.Data_Types_And_Arithmetic_Expressions_3;

import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        int seconds, minutes, remainingSeconds;

        Scanner input = new Scanner(System.in);

        // Получить общее время в секундах
        System.out.print("Введите общее время в секундах: ");
        seconds = input.nextInt();

        // Вычислить время в минутах
        minutes = seconds / 60;

        // Вычислить оставшееся кол-во секунд в минуте
        remainingSeconds = seconds % 60;

        // Отобразить время в минутах и оставшихся секундах
        System.out.println(seconds + " сек. содержит " + minutes +
                " мин. и " + remainingSeconds + " сек.");
    }
}

