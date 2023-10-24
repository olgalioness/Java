package Course8_OOP.Circle.Circle2;

public class Circle {
    double radius;
    static int count = 0;

    Circle() {
        int radius;
        count++;
    }

    Circle(double newRadius) {
        radius = newRadius;
        count++;
    }

    static int getCount() {
        return count;
    }
    double getArea(){
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle();
        System.out.println(circle.count);
    }
}
