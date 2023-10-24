package org.Basics_of_Java_Programming_1.Course.Cycles_6;

import java.util.Scanner;

public class ValidateLetter {
    public static void main(String[ ] args) {
        String s;
        char letter_choice;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Введите латинскую букву от A до E: ");
            s = input.nextLine();
            letter_choice = s.charAt(0);
        } while (letter_choice < 'A' || letter_choice > 'E');
    }
}
