package org.Basics_of_Java_Programming_1.Course.Mathematical_Functions_Symbols_Strings_5;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        String s;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите целую строчку: ");
        s = input.nextLine();                               //nextLine считывания целой строчки текста можно использовать метод

        System.out.println("Введенная строчка равна " + s);
    }
}

