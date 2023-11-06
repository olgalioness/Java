package org.Basics_of_Java_Programming_1.Course.Data_Types_And_Arithmetic_Expressions_3;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        double purchaseAmount, tax;

        Scanner input = new Scanner(System.in);

        // Получить стоимость покупки в рублях
        System.out.print("Введите стоимость покупки в рублях: ");
        purchaseAmount = input.nextDouble();

        // Вычислить НДС в рублях
        tax = purchaseAmount * 0.2;

        // Отобразить НДС в рублях
        System.out.println("НДС равен " + (int) (tax * 100) / 100.0 + " руб.");             //округление до сотых
        System.out.println("НДС равен " + (int) (tax * 100 + 0.5) / 100.0 + " руб.");       //округлить до ближайщего целого числа

        //НДС округляется до сотых в меньшую сторону (в пользу покупателя), а остальные знаки просто отбрасываются.
    }
}

