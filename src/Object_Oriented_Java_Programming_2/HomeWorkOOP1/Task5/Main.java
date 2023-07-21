package HomeWorkOOP1.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int n = inputN();
            System.out.println("Успешный ввод!");
        } catch (Exception ex) {
           System.out.println(ex.getMessage());
        }
    }

    private static int inputN() throws IllegalArgumentException {
        System.out.println("Введите число n, 0 < n < 100");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 100 || n <= 0) {
            throw new IllegalArgumentException("Неверный ввод");
        }
        return n;
    }
}



