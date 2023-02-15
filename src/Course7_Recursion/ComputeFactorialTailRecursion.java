package Course7_Recursion;

import java.util.Scanner;

public class ComputeFactorialTailRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите неотрицательное целое число: ");
        int n = input.nextInt();

        // Отобразить n!
        System.out.println(n + "! равно " + factorial(n));
    }

    /**
     * Возвращает n!
     */
    public static long factorial(int n) {
        return factorial(n, 1); // вызывает вспомогательный метод
    }

    /**
     * Вспомогательный метод с хвостовой рекурсией для n!
     */
    private static long factorial(int n, int result) {
        if (n == 0)
            return result;
        else
            return factorial(n - 1, n * result); // рекурсивный вызов
    }
}

