package Course3_DataTypesAndArithmeticExpressions;

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        double fahrenheit, celsius;

        Scanner input = new Scanner(System.in);

        // Получить температуру в градусах по шкале Фаренгейта
        System.out.print("Введите температуру в градусах по шкале Цельсия: ");
        celsius = input.nextDouble();

        // Преобразовать температуру в градусы по шкале Фаренгейта
        fahrenheit = (9.0 / 5) * celsius + 32;

        // Отобразить температуру в градусах по шкале Фаренгейта
        System.out.println(celsius + " градуса по шкале Цельсия равно " +
                fahrenheit + " градуса по шкале Фаренгейта.");
    }
}

