package week2;

import java.util.Scanner;

// Дано число n. Нужно проверить четное ли оно.
/*
        Входные данные: 4
        Выходные данные: true или (Число четное)

        Входные данные: 3
        Выходные данные: false или (Число нечетное)
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        String str;

        if (n % 2 == 0) {
            System.out.println("BOOM!");
        }


        if (n % 2 == 0) {
            str = "Число четное";               //в одну строку лучше всегда фигурные скобки
        } else {
            str = "Число нечетное";
        }

        String str2 = (n % 2 == 0) ? "Число четное" : "Число нечетное";
        System.out.println(str);
        System.out.println(str2);
    }
}


