package Course8_OOP.Circle;

public class AlternativeCircle {                       //имя объекта соответсвует имя класса
    public static void main(String[] args) {
        AlternativeCircle circle1 = new AlternativeCircle();            //объявление переменной типа объекта и присваивание новый объект созданный из конструктора
        //AlternativeCircle(){}      конструктор по умолчанию
        System.out.println("Площадь круга с радиусом " + circle1.radius + " равна " + circle1.getArea());
        //обращаемся к объекту circle по ссылке на объект .radius
        //обращаемся к объекту circle и вызов метода по ссылке на объект .getArea()

        AlternativeCircle circle2 = new AlternativeCircle(25);
        System.out.println("Площадь круга с радиусом " + circle2.radius + " равна " + circle2.getArea());
        AlternativeCircle circle3 = new AlternativeCircle(125);
        System.out.println("Площадь круга с радиусом " + circle3.radius + " равна " + circle3.getArea());

        circle2.radius = 100;
        System.out.println("Площадь круга с радиусом " + circle2.radius + " равна " + circle2.getArea());
    }

    double radius;

    AlternativeCircle() {
        radius = 1;
    }

    AlternativeCircle(double newRadius) {
        radius = newRadius;
    }

    double getArea() {
        return radius * radius * Math.PI;
    }

    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    void setRadius(double newRadius) {
        radius = newRadius;
    }
}