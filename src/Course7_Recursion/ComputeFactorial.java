package Course7_Recursion;
import java.util.Scanner;

public class ComputeFactorial {
    /**
     * Метод main
     */
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
        if (n == 0) // простой случай
            return 1;
        else
            return n * factorial(n - 1); // рекурсивный вызов
    }
}