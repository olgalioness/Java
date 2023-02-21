package Homework1part2;

import java.util.Scanner;
/*
Петя недавно изучил строки в джаве и решил попрактиковаться с ними.
Ему хочется уметь разделять строку по первому пробелу.
Для этого он может воспользоваться методами indexOf() и substring().

На вход подается строка. Нужно вывести две строки, полученные из входной разделением по первому пробелу.

Ограничение:
В строке гарантированно есть хотя бы один пробел
Первый и последний символ строки гарантированно не пробел
2 < s.length() < 100
 */
public class Task7 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = console.nextLine();

        int index = s.indexOf(' ');

        if ((2 < s.length() && s.length() < 100)) {
            String first = s.substring(0, index);
            String last = s.substring(index + 1);
            System.out.println(first);
            System.out.println(last);
        }
    }
}

