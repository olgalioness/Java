package Course3_DataTypesAndArithmeticExpressions;

import java.util.Scanner;

/* Отобразить среднее геометрическое трех чисел*/

public class CubicMean {

    public static void main(String[] args) {
        double number1, number2, number3, average;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите три числа, разделенные пробелами: ");
        number1 = input.nextDouble();
        number2 = input.nextDouble();
        number3 = input.nextDouble();

        //average = Math.cbrt(number1*number2*number3);
        average = Math.pow(number1 * number2 * number3, 1. / 3);

        // Отобразить среднее кубическое трех чисел
        System.out.println("Среднее кубическое " + number1 + " " + number2
                + " " + number3 + " равно " + average + ".");
    }
}