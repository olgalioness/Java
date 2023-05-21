package Course2_DevelopmentOfSimpleJavaPrograms;
import java.util.Scanner; // Scanner находится в пакете java.util

public class ComputeAverage {
    public static void main(String[] args) {
        double number1, number2, number3, average; // объявление переменных

        Scanner input = new Scanner(System.in); // создание объекта типа Scanner

        // Получить три числа
        System.out.print("Введите три числа, разделенные пробелами: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();

        // Вычислить среднее арифметическое трех чисел
        average = (number1 + number2 + number3) / 3;

        // Отобразить среднее арифметическое трех чисел
        System.out.println("Среднее арифметическое " + number1 + " " + number2
                + " " + number3 + " равно " + average + ".");
    }
}