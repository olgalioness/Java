package org.Basics_of_Java_Programming_1.Course.Mathematical_Functions_Symbols_Strings_5;

import java.util.Scanner;

public class StringExample3 {
    public static void main(String[] args) {
        String s;
        char ch;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите символ: ");
        s = input.nextLine();                                   //charAt(0), чтобы вернуть символ

        ch = s.charAt(0);

        System.out.println("Введенный символ равен " + ch);
    }
}

