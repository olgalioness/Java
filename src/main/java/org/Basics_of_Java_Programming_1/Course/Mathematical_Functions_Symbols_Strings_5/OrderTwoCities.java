package org.Basics_of_Java_Programming_1.Course.Mathematical_Functions_Symbols_Strings_5;

import java.util.Scanner;

public class OrderTwoCities {
    //equalsIgnoreCase() и compareToIgnoreCase() сравнение двух строк игнорируют регистр букв.
    //str.startsWith(prefix), чтобы проверить, начинается ли строка str с указанного префикса,
    //str.endsWith(suffix) — чтобы проверить, заканчивается ли строка str с указанным суффиксом,
    //str.contains(s1) — чтобы проверить, содержит ли строка str строку s1.
    //substring(beginIndex)- Возвращает подстроку, которая начинается с символа под индексом beginIndex и продолжается до конца строки, как показано на рисунке.
    //substring(beginIndex, endIndex) - Возвращает подстроку, которая начинается с символа под индексом beginIndex и заканчивается символом под индексом endIndex - 1, как показано на рисунке. Обратите внимание, что символ под индексом endIndex не является частью подстроки.
    public static void main(String[] args) {
        String city1, city2;

        Scanner input = new Scanner(System.in);

        // Получить имена двух городов
        System.out.print("Введите имя первого города: ");
        city1 = input.nextLine();
        System.out.print("Введите имя второго города: ");
        city2 = input.nextLine();

        // Сравнить и отобразить
        if (city1.compareTo(city2) < 0)                         // >, >=, < и <= происходят синтаксические ошибки. Вместо этого необходимо использовать s1.compareTo(s2).
            System.out.println("Имена городов по алфавиту: " + city1 + " " + city2);
        else
            System.out.println("Имена городов по алфавиту: " + city2 + " " + city1);

        String message = "Welcome to Java";
        System.out.println(message.substring(0,11) + "HTML");
        //Если beginIndex равен endIndex, то метод substring(beginIndex, endIndex) возвращает пустую строку длиной 0. Если beginIndex > endIndex, то произойдет ошибка во время выполнения.
    }
}

