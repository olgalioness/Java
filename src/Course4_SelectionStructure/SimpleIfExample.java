package Course4_SelectionStructure;

import java.util.Scanner;

public class SimpleIfExample {
    public static void main(String[] args) {
        int number = 1;
        int x = 0;
        int scope = 100;
        int pay = 100;
        int product = 100;
        int rest_heart_rate =70;

        // присваивает переменной x значение 1, если y больше 0.
        if (number > 0) {
            x = 1;
            System.out.println("x равен = " + x);
        }
        //увеличивает pay на 3%, если score больше 90.

        if (scope > 90) {
            pay *= 1.03;
            System.out.println("pay равен= " + pay);
        } else {
            pay *= 1.01;
            System.out.println("pay равен= " + pay);
        }

        if (x != 0) {
            product *= x;
            System.out.println("product равен= " + product);
        }
        if (rest_heart_rate > 56)
            System.out.println("Продолжайте тренироваться");
        else
            System.out.println("Ваше сердце в отличном состоянии");
    }
}
