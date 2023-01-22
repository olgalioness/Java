package Homework1part2;

import java.util.Scanner;

/*
        За каждый год работы Петя получает на ревью оценку.
        На вход подаются оценки Пети за последние три года (три целых положительных числа).
        Если последовательность оценок строго монотонно убывает, то вывести "Петя, пора трудиться"
        В остальных случаях вывести "Петя молодец!"

        Ограничение:
        0 < a, b, c < 100
 */
public class Task1 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите три оценки: ");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if ((0 < a && a < 100) && (0 < b && b < 100) && (0 < c && c < 100)) {
            if (a > b && b > c) {
                System.out.print("Петя, пора трудиться");
            } else {
                System.out.print("Петя молодец!");
            }
        }
    }
}
