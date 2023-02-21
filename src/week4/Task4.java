package week4;

import java.util.Scanner;

/*
Начальный вклад в банке равен 1000.
Каждый месяц размер вклада увеличивается на P процентов от имеющейся суммы (0 < P < 25).
Найти через какое количество времени размер вклада будет больше 1100
и вывести найденное количество месяцев и итоговой размер вклада.

15 ->
1
1150.0

3 ->
4
1125.50881
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double percent = (console.nextInt()) / 100.0;
        int i = 0;
        double sum = 1000;

        for (; sum <= 1100; sum += sum * percent) {
            i++;                                                    //считаем месяцы

        }
        System.out.println("Количество месяцев: " + i);
        System.out.println("Сумма на вкладе: " + sum);

        //Case2
        Scanner scanner = new Scanner(System.in);

        int p = scanner.nextInt();
        double start = 1000;
        double limit = 1100;
        int month = 0;
        while (start < limit) {
            start += start * p / 100;
            month++;
        }
        System.out.println("Количество месяцев: " + month);
        System.out.println("Сумма на вкладе: " + start);
    }
}