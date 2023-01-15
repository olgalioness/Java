package week1;
import java.util.Scanner;


public class DemoTask {
    public static void main(String[] args) {
        //Длины окружности вычисляется по формуле = 2*PI*radius
        Scanner console = new Scanner(System.in);
        double s = console.nextDouble();

        //double l = 2 * Math.PI * s;
        double l = 2 * 3.1415926535 * s;
        System.out.println("Длина окружности: " + l);
    }
}