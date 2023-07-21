
package Course2_DevelopmentOfSimpleJavaPrograms;

import java.util.Scanner;

public class CircleRadius {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Введите радиус: ");

        double radius = console.nextDouble();
        double area = Math.PI * (radius * radius);

        System.out.println("Длинна окружности равна: " + area);
    }
}
