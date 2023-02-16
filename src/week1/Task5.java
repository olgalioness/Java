package week1;

/*
Напишите аналог функции swap, которая меняет значения двух параметров местами без вспомогательной переменной.
 Входные данные: а=7, b=5
 Выходные данные: a=5, b=7
 */


import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        swap();             //в точке входа вызываем метод
    }

    public static void swap() {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        int b = console.nextInt();
        a = a + b; // 7 + 5 = 12            //трассировка 12
        b = a - b; // 12 - 5 = 7            //трассировка 7
        a = a - b; // 12 - 7 = 5            //трассировка 2
        System.out.println("a = " + a + " b = " + b);
    }
}
//в настройках IDEA находится автоимпорт, или alt + enter
