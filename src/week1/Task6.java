package week1;

import java.util.Scanner;

/*
    Вычислить доход работника за неделю.
    Прочитать из консоли данные количество рабочих часов в неделю, часовая ставка, налог.
    Параметры:
    c - количество рабочих часов в неделю   40
    r - ставка за час   300
    t - налог 13%           (100 - 13) / 100

 */

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int c = console.nextInt();
        int r = console.nextInt();
        int t = console.nextInt();

        double result = c * r * (100d - t) / 100;       //int округляет, отбрасывая все точки.
        System.out.println("Доход " + result);

    }
}
