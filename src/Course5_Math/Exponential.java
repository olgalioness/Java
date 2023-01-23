package Course5_Math;

public class Exponential {
    public static void main(String[] args) {
        //Экспоненциальные методы
        //exp(x)	Возвращает число e, возведенное в степень x(e^x).
        //log(x)	Возвращает натуральный логарифм x (ln(x) = log по основанию e(x)).
        //log10(x)	Возвращает десятичный логарифм x (log по основанию 10(x)).
        //pow(a, b)	Возвращает a, возведенное в степень b (a^b).
        // sqrt(x)	Возвращает квадратный корень x  для x >=0

        System.out.println("1. " + Math.exp(3.5));              // e^3.5 равно 33.11545
        System.out.println("2. " + Math.log(3.5));              //ln(3.5) равно  1.25276
        System.out.println("3. " + Math.log10(3.5));            //log по основанию 10 (3.5) равно 0.544
        System.out.println("4. " + Math.pow(2, 3));             //2^3 равно 8.0
        System.out.println("5. " + Math.pow(3, 2));             //3^2 равно 9.0
        System.out.println("6. " + Math.pow(4.5, 2.5));         //4.5^2.5 равно 42.9567
        System.out.println("7. " + Math.sqrt(4));                //кубический корень 4 равно 2.0
        System.out.println("8. " + Math.sqrt(10.5));             //кубический корень 10.5 равно 3.24

    }
}