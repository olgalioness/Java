package org.Basics_of_Java_Programming_1.Homework1part2;

import java.util.Scanner;
/*
Раз так легко получается разделять по первому пробелу, Петя решил немного изменить предыдущую программу и теперь разделять строку по последнему пробелу.

	Ограничения:
		В строке гарантированно есть хотя бы один пробел
		Первый и последний символ строки гарантированно не пробел
2 < s.length() < 100

 */
public class Task8 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = console.nextLine();

        int index = s.lastIndexOf(' ');

        if ((2 < s.length() && s.length() < 100)) {
            String first = s.substring(0, index);
            String last = s.substring(index + 1);
            System.out.println(first);
            System.out.println(last);
        }
    }
}

