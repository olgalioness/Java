package Homework1part1;
import java.util.Scanner;
/*
1. Вычислите и выведите на экран объем шара, получив его радиус r с консоли.
Подсказка: считать по формуле V = 4/3 * pi * r^3. Значение числа pi взять из
Math.
Ограничения:
0 < r < 100

Входные данные: 9 25
Выходные данные:
3053.6280592892786
65449.84694978735
 */



public class Task1 {
        public static void main(String[] args) {

            Scanner console = new Scanner(System.in);
            //System.out.print("Введите радиус: ");

            double radius = console.nextDouble();

            if (radius > 0) {
                if (radius < 100) {
                    double area = 4.0/3.0 * Math.PI * (Math.pow(radius, 3));
                    System.out.println(area);
                }
            }
        }
    }

