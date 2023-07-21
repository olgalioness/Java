package Homework1part3;

import java.util.Scanner;
/*
В банкомате остались только купюры номиналом 8 4 2 1. Дано положительное
число n - количество денег для размена. Необходимо найти минимальное
количество купюр с помощью которых можно разменять это количество денег
(соблюсти порядок: первым числом вывести количество купюр номиналом 8,
вторым - 4 и т д)
Ограничения:
0 < n < 1000000
 */
public class Task6 {
    public static void main(String[] args) {
        int n, numberOf8Roubles, numberOf4Roubles,
                numberOf2Roubles, numberOf1Roubles;

        Scanner input = new Scanner(System.in);

        // Получить сумму в рублях
        System.out.print("Введите сумму в рублях: ");
        n = input.nextInt();

        if ((0 < n && n < 1000000)) {
            // Вычислить количество 8 руб. купюр и обновить оставшуюся сумму
            numberOf8Roubles = n / 8;
            n %= 8;

            // Вычислить количество 4 руб. купюр и обновить оставшуюся сумму
            numberOf4Roubles = n / 4;
            n %= 4;

            // Вычислить количество 2 руб. купюр и обновить оставшуюся сумму
            numberOf2Roubles = n / 2;
            n %= 2;

            // Вычислить количество 1 руб. купюр и обновить оставшуюся сумму
            numberOf1Roubles = n / 1;
            n %= 1;


            // Отобразить количество купюр каждого достоинства
            System.out.println("Ваша сумма состоит из");
            System.out.println(numberOf8Roubles + " " + numberOf4Roubles + " " + numberOf2Roubles + " " + numberOf1Roubles);
        }
    }
}

