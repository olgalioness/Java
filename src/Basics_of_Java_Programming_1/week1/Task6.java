package week1;

import java.util.Scanner;

/*
    Вычислить доход работника за неделю.
    Прочитать из консоли данные количество рабочих часов в неделю, часовая ставка, налог.
    Параметры:
    c - количество рабочих часов в неделю   40
    r - ставка за час   300
    t - налог 17%           (100 - 13) / 100

 */

public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int c = console.nextInt();                          //кол-во рабочих часов в неделю
        int r = console.nextInt();                          //часовая ставка
        int t = console.nextInt();                          //налог

        double result = c * r * (double)(100 - t) / 100;       //или 100d или 100. или 100.0,   int отбрасывая все точки.

        System.out.println("Доход " + result);
    }
}
//float result = 233335.26f;                            //синтаксис языка с литером f явно указать для вещественных чисел
//если бы хотябы одна переменная double, то и результат double
