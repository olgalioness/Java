package Course8_OOP.Circle;
/*
По примеру класса Circle, создайте класс Rectangle для представления прямоугольника. Класс Rectangle должен содержать:

Два поля данных типа double с именами width и height, задающими ширину и высоту прямоугольника. Значение по умолчанию: -1 как для ширины, так и для высоты.
Безаргументный конструктор, создающий прямоугольник с указанными по умолчанию значениями.
Конструктор, создающий прямоугольник с указанными шириной и высотой.
Метод с именем getArea(), возвращающий площадь этого прямоугольника.
Метод с именем getPerimeter(), возвращающий периметр.
Нарисуйте (на бумаге или в графическом редакторе) UML-диаграмму класса Rectangle, а затем реализуйте этот класс. Напишите клиент этого класса — программу, которая создает два объекта типа Rectangle: первый — с шириной 4 и высотой 40, а второй - с шириной 3.5 и высотой 35.9. Программа также должна отображать ширину, высоту, площадь и периметр каждого прямоугольника в указанном порядке.
 */

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 40);
        System.out.println("Площадь прямоугольника с шириной " +
                rectangle.width + " и высотой " +
                rectangle.height + " равна " +
                rectangle.getArea());
        System.out.println("Периметр прямоугольника равен " +
                rectangle.getPerimeter());

        Rectangle yourRectangle = new Rectangle(3.5, 35.9);
        System.out.println("Площадь прямоугольника с шириной " +
                yourRectangle.width + " и высотой " +
                yourRectangle.height + " равна " +
                yourRectangle.getArea());
        System.out.println("Периметр прямоугольника равен " +
                yourRectangle.getPerimeter());
    }
}

class Rectangle {
    double width = 1;
    double height = 1;

    public Rectangle() {
    }

    public Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
