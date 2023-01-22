package Homework1part2;

import java.util.Scanner;

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

