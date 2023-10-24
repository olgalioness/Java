package Homework2part2;
/*
10. Обратный порядок
На вход подается число N.
Необходимо вывести цифры числа справа налево.
Решить задачу нужно через рекурсию.

Ограничение:
0 < N < 1000000
 */
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        System.out.println(reverse(str));
    }
    private static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
    private static String reverse (String str) {
        return reverseString(str.replace("", " ").trim());
    }
}

