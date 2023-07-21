package Homework1part1;

import java.util.Scanner;

/*
На вход подается бюджет мероприятия – n тугриков.
Бюджет на одного гостя – k тугриков.
Вычислите и выведите, сколько гостей можно пригласить на мероприятие.

Ограничение:
0 < n < 100000
0 < k < 1000
k < n

Пример входных данных
14185 72


Пример выходных данных
197
 */
public class Task9 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Введите бюджет мероприятия: ");
        int n = console.nextInt();
        System.out.print("Введите бюджет на одного гостя: ");
        int k = console.nextInt();

        if (n > 0) {
            if (n < 100000) {
                if (k > 0) {
                    if (k < 1000) {
                        if (k < n) {
                            int budget = n / k;
                            System.out.println("Пригласить на мероприятие " + budget + " гостя");
                        }
                    }
                }
            }
        }
    }
}