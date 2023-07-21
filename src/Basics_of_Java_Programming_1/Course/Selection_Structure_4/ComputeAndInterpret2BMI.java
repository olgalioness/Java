package Course4_SelectionStructure;

import java.util.Scanner;

public class ComputeAndInterpret2BMI {
    public static void main(String[] args) {
        final int SMS_PER_METER = 100; // 1 метр содержит 100 см
        double weight, meters, centimeters, bmi, height;

        Scanner input = new Scanner(System.in);

        // Получить вес в килограммах
        System.out.print("Введите вес в килограммах: ");
        weight = input.nextDouble();

        // Получить рост в метрах
        System.out.print("Введите рост в метрах: ");
        meters = input.nextDouble();
        // Получить рост в сантиметрах
        System.out.print("Введите рост в сантиметрах: ");
        centimeters = input.nextDouble();

        // Вычислить BMI
        height = (meters*SMS_PER_METER + centimeters ) / SMS_PER_METER;
        bmi = weight / Math.pow(height, 2);

        // Отобразить и интерпретировать BMI
        System.out.println("BMI равно " + bmi);
        if (bmi < 18.5)
            System.out.println("Недостаточный вес");
        else if (bmi < 25)
            System.out.println("Норма");
        else if (bmi < 30)
            System.out.println("Избыточный вес");
        else
            System.out.println("Ожирение");
    }
}
