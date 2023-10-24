package org.Basics_of_Java_Programming_1.Homework1part1;
import java.util.Scanner;

/*
Прочитайте из консоли имя пользователя и выведите в консоль строку:
Привет, <имя пользователя>!

Подсказка:
Получите данные из консоли c помощью объекта Scanner, сохраните в переменную userName и выведите в консоль с помощью System.out.println()

Пример входных данных
Иван
 */
public class Task3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String userName = console.nextLine();

        System.out.println("Привет, " + userName + "!");
    }
}
