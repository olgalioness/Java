package week1;

import java.util.Scanner;

public class Task4 {
    /*Дана площадь круга, нужно найти диаметр окружности и длину окружности.
    Входные данные: 91
    Выходные данные:
    Diameter: 10.764051215546116 length: 33.81626422162396
        s = PI * r ^ 2 площадь круга
        r = d / 2  диаметр круга
        S = PI * (d^2 / 4 -> d = sqrt(S * 4 /PI) диаметр окружности
        L = PI * d
     */

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double s = console.nextDouble();

        double d = Math.sqrt(s * 4 / Math.PI);       //извлечение квадратного корня
        double l = Math.PI * d;

        System.out.println("Диаметр окружности: " + d);
        System.out.println("Длина окружности: " + l);
    }
}
