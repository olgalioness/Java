package week2;

import java.util.Scanner;

/*
    С помощью тернарного оператора замените инициализацию переменной y в указанном коде:
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    int y;
    if (x > 0) {a
        if (x < 100) {a
            y = 1;b
        } else {
            y = 0;b
        }
    } else {
        y = -1;b
    }*/

public class Task0 {
    public static void main(String[] args) {
        //new Scanner(System.in).var
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int y = x > 0 ? x < 100 ? 1 : 0 : -1;
        //int y = x > 0 ? (x < 100 ? 1 : 0) : -1;

        System.out.println(y);
        //если х > 0 и если х < 100 тогда 1 иначе 0  иначе -1
        // x < 100 ? 1 : В - вложенное выражение
        // x > 0 ? ВЛОЖЕННОЕ : -1
    }
}
