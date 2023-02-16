package week1;

import java.util.Scanner;
/*Напишите программу, которая получает два числа с плавающей точкой х и у
в аргументах командной строки и выводит евклидово расстояние от точки (х, у) до точки (0, 0)*/
//x = 5 y = 7, на графике - длинна прямой линии на пересечении x,y - это гипотенуза
//выходные данные 8.602325267042627
//квадрат гипотенузы = сумме квадратов катетов
//c^2 = a^2 * b^2
public class Task3 {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x = console.nextDouble();
        double y = console.nextDouble();

        System.out.println(Math.sqrt(x * x + Math.pow(y, 2)));
        //возвести с помощью пакета math
    }
}
