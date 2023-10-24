package org.Basics_of_Java_Programming_1.Course.Mathematical_Functions_Symbols_Strings_5;

    import java.util.Scanner;

public class StringExample1 {
    public static void main(String[] args) {
        String s1, s2, s3;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите три слова через пробел: ");
        s1 = input.next();                                          //next считывает строку до первого пробельного символа
        s2 = input.next();
        s3 = input.next();

        System.out.println("s1 равно " + s1);
        System.out.println("s2 равно " + s2);
        System.out.println("s3 равно " + s3);
    }
}

