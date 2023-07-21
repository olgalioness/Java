package week1;

import java.util.Scanner;

/*
 Вывести сначала первую цифру (единицы), затем правую (десятки)
 входные данные: 78
 выходные данные: 7  и  8
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        int first = number / 10;
        int second = number % 10;

        System.out.println(first + " и " + second);
    }
}
