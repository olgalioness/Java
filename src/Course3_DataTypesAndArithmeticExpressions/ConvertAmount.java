package Course3_DataTypesAndArithmeticExpressions;

import java.util.Scanner;

public class ConvertAmount {
    public static void main(String[] args) {
        final double ROUBLES_PER_EUR = 81.21;

        int eur;
        double roubles;

        Scanner input = new Scanner(System.in);

        //Получить сумму денег в евро
        System.out.print("Введите сумму денег в евро: ");
        eur = input.nextInt();

        //Конвертировать сумму денег в российские рубли
        roubles = ROUBLES_PER_EUR * eur;

        //Отобразить сумму денег в российских рублях в пользу покупателя
        System.out.println("Она равна " + (int) (roubles * 100) / 100.0 + " росскийского рубля.");
    }
}
