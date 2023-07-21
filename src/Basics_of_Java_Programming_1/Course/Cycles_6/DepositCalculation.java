package Course6_Cycles;

import java.time.LocalDate;
import java.util.Scanner;

public class DepositCalculation {
    static final int MONTHS_OF_YEAR = 12;               // месяцев в году
    static final int DAYS_YEAR = 365;                   // дней в году

    public static void main(String[] args) {
        int startMonth;                                 // номер месяца открытия вклада
        int startYear;                                  // год открытия вклада
        int depositTerm;                                // срок вклада в месяцах
        double rate;                                    // процентная ставка (% годовых)
        double depositAmount;                           // сумма вклада
        double accruedInterestPerMonth;                 // доход по вкладу в текущем месяце
        double accruedInterestTotal = 0;                // суммарный доход по вкладу

        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца открытия вклада: ");      // Получить номер месяц открытия вклада
        startMonth = input.nextInt();

        System.out.print("Введите год открытия вклада: ");              // Получить год открытия вклада
        startYear = input.nextInt();

        System.out.print("Введите срок вклада в месяцах: ");            // Получить срок вклада в месяцах
        depositTerm = input.nextInt();

        System.out.print("Введите сумму вклада: ");                     // Получить сумму вклада
        depositAmount = input.nextDouble();

        System.out.print("Введите годовую процентную ставку: ");        // Получить годовую процентную ставку
        rate = input.nextDouble();

        int monthsCount = 0;                                        // счетчик месяцев
        int i = startYear;
        while (monthsCount < depositTerm) {
            for (int j = 1; j <= MONTHS_OF_YEAR; j++) {          //Если номер месяца меньше или равно номерц месяца открытия вклада, то переходим к следующему месяцу, он не попадает в интервал
                // итерация по месяцам с 1 до 12
                if (i == startYear && j <= startMonth) {        // Если номер месяца меньше или равно номеру месяца открытия вклада, то переходим к следующему месяцу, он не попадает в интервал
                    continue;                                   // пропускаем текущую итерацию, переходим к следующему месяцу
                }
                if (monthsCount == depositTerm) {           // Если номер текущего месяца равен сроку вклада, то расчет заканчиваем и выходим из цикла
                    break;                                  // выходим из текущего цикла for, из внешнего цикла while выходим по условию monthsCount < depositTerm
                }
                int lengthOfMonth = LocalDate.of(i, j, 1).lengthOfMonth();                                //Получаем количество дней в текущем месяце

                accruedInterestPerMonth = depositAmount * rate / 100 / DAYS_YEAR * lengthOfMonth;                   // Рассчитаем доход по вкладу в текущем месяце
                accruedInterestPerMonth = Math.round(accruedInterestPerMonth * 100) / 100.0;                        // округление до копейки

                System.out.println("Начислено процентов в " + i + " году " + j + " месяца = " + accruedInterestPerMonth);    // Вывести результат начисленных процентов в месяце

                accruedInterestTotal = accruedInterestTotal + accruedInterestPerMonth;              // Добавим процент по вкладам текущего месяца к суммарной выплате

                monthsCount++;                                                                      // увеличим счетчик месяцев на 1
            }
            i++;
        }
        System.out.println("Всего начислено процентов = " + accruedInterestTotal);          // Вывести итоговый результат начисленных процентов
    }
}