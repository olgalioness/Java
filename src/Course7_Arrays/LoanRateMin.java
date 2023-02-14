package Course7_Arrays;

import java.util.Scanner;

public class LoanRateMin {
    public static void main(String[] args) {
        int numberOfLoanRates;              // количество процентных ставок
        double[] loanRatesArray;            // массив процентных ставок
        double loanRateMin = 100;           // минимальная процентная ставка

        Scanner input = new Scanner(System.in);

        // Получить количество процентных ставок
        System.out.print("Введите количество процентных ставок: ");
        numberOfLoanRates = input.nextInt();

        loanRatesArray = new double[numberOfLoanRates];     // инициализируем массив

        for (int i = 0; i < numberOfLoanRates; i++) {
            System.out.print("Введите процентную ставку: ");
            loanRatesArray[i] = input.nextDouble();
        }
        for (int i = 0; i < loanRatesArray.length; i++) {
            if (loanRatesArray[i] < loanRateMin) {
                loanRateMin = loanRatesArray[i];
            }
        }
// Вывести минимальную процентную ставку по банковскому кредиту
        System.out.println("Минимальная процентная ставка по банковскому кредиту равна " + loanRateMin);
    }
}
