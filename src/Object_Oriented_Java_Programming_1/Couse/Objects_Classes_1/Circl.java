package week7home.task2;

public class Circl{
        double radius;

        static int numberOfObjects = 0;

        Circl(){
            radius = 1.0;
            numberOfObjects++;
        }
        Circl(double newRadius){
            radius = newRadius;
            numberOfObjects++;
        }
        static int getNumberOfObjects(){
            return numberOfObjects;
        }
        double getArea(){
            return radius * radius * Math.PI;
        }
        public static void main(String[] args) {
        System.out.println("До создания объектов");
        System.out.println("Количество объектов типа Circle равно " + Circl.numberOfObjects);

        Circl c1 = new Circl();

        System.out.println("\nПосле создания с1");
        System.out.println("c1: радиус (" + c1.radius + ") и количество объектов типа Circle (" + c1.numberOfObjects + ")");

        Circl c2 = new Circl(5);

        c1.radius = 9;

        System.out.println("\nПосле создания c2 и изменения c1");
        System.out.println("c1: радиус (" + c1.radius + ") и количество объектов типа Circle (" + c1.numberOfObjects + ")");
        System.out.println("c2: радиус (" + c2.radius + ") и количество объектов типа Circle (" + c2.numberOfObjects + ")");
    }
}

