package week2;

import java.util.Scanner;

//как можно корректно считать String после считывания числа.
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        System.out.println(a);
        System.out.println(str);
    }
}
