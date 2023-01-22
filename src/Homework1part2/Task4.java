package Homework1part2;

import java.util.Scanner;

/*
Петя снова пошел на работу.
С сегодняшнего дня он решил ходить на обед строго после полудня.
Периодически он посматривает на часы (x - час, который он увидел).
Помогите Пете решить, пора ли ему на обед или нет.
Если время больше полудня, то вывести "Пора". Иначе - “Рано”.

Ограничение:
0 <= n <= 23
 */
public class Task4 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите время обеда ");
        int n = console.nextInt();

        if ((0 <= n && n <= 23)) {
            System.out.print((n >= 12) ? "Пора" : "Рано");
        }
    }
}