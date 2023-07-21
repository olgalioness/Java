package Course7_Methods;

public class Increment {

    public static void main(String[] args) {
        int x = 1;                                              //значение переменной x остается неизменным вне зависимости от того, что делает метод.
        System.out.println("До вызова метода x равен " + x);
        increment(x);
        System.out.println("После вызова метода x равен " + x);
    }

    public static void increment(int n) {
        n++;
        System.out.println("Внутри метода n равен " + n);
    }
}

