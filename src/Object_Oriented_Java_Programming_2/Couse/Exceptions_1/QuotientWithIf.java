package Course9_OOP2;

import java.util.Scanner;

public class QuotientWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введте два целых числа: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if (number2 != 0)
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        else
            System.out.println("Делить на ноль нельзя!");
    }
}


