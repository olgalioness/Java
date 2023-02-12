package Course7_Methods;

import java.util.Scanner;

public class GreatestCommonDivisorMethod {
    /**
     * Метод main
     */
    public static void main(String[] args) {
        int n1, n2, gcd;

        Scanner input = new Scanner(System.in);

        // Получить два числа
        System.out.print("Введите первое число: ");
        n1 = input.nextInt();
        System.out.print("Введите второе число: ");
        n2 = input.nextInt();

        // Вычислить НОД двух чисел
        gcd = find_gcd(n1, n2);

        // Отобразить НОД двух чисел
        System.out.println("Наибольший общий делитель " + n1 +
                " и " + n2 + " равен " + gcd);
    }

    /**
     * Возвращает НОД двух чисел
     */
    public static int find_gcd(int n1, int n2) {
        int gcd, k;
        gcd = 1; // НОД инициализируется с 1
        k = 1; // предполагаемое значение НОД

        while (k <= n1 && k <= n2) {
            if (n1 % k == 0 && n2 % k == 0)
                gcd = k; // НОД обновляется
            k++;
        }

        return gcd; // НОД возвращается
    }
}

