package Course5_Math;

import java.util.Scanner;

public class ComputeAngles {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3;
        double a, b, c, d, e, f;

        Scanner input = new Scanner(System.in);

        // Получить декартовы координаты трех вершин треугольника
        System.out.print("Введите декартовы координаты трех вершин треугольника "
                + "через пробел \nx1 y1 x2 y2 x3 y3: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        // Вычислить длины трех сторон треугольника
        a = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        c = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        // Вычислить размеры трех углов треугольника в градусах
        d = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        e = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        f = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        // Отобразить размеры трех углов треугольника в градусах с округлением до сотых
        System.out.println("Три угла треугольника равны " +
                Math.round(d * 100) / 100.0 + " " +
                Math.round(e * 100) / 100.0 + " " +
                Math.round(f * 100) / 100.0 + " градуса.");
    }
}

