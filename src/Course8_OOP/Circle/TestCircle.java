package Course8_OOP.Circle;

public class TestCircle {                                                   //определяет класс и использует его для создания объектов
    /** Метод main */
    public static void main(String[] args) {

        Circle circle1 = new Circle();                                      // Создать объект1 круг 1 с радиусом 1
        System.out.println("Площадь круга с радиусом "
                + circle1.radius + " равна " + circle1.getArea());


        Circle circle2 = new Circle(25);                           // Создать объект2 круг 2 с радиусом 25
        System.out.println("Площадь круга с радиусом "
                + circle2.radius + " равна " + circle2.getArea());


        Circle circle3 = new Circle(125);                           // Создать объект3 круг 3 с радиусом 125
        System.out.println("Площадь круга с радиусом "
                + circle3.radius + " равна " + circle3.getArea());

                                                                                // Изменить радиус объекта2 круга
        circle2.radius = 100; // или circle2.setRadius(100)
        System.out.println("Площадь круга с радиусом "
                + circle2.radius + " равна " + circle2.getArea());
    }
}
