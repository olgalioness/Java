package Course7_Methods;

public class Test3 {
    public static void main(String[] args) {
        // Инициализировать times
        int times = 3;
        System.out.println("До вызова,"
                + " значение times равно " + times);
        // Вызвать nPrintln и отобразить times
        nPrintln("Welcome to Java!", times);
        System.out.println("После вызова,"
                + " значение times равно " + times);
    }
    // Отобразить message n раз
    public static void nPrintln(
            String message, int n) {
        while (n > 0) {
            System.out.println("n = " + n);
            System.out.println(message);
            n--;
        }
    }
}
//До вызова, значение times равно 3
//n = 3
//Welcome to Java!
//n = 2
//Welcome to Java!
//n = 1
//Welcome to Java!
//После вызова, значение times равно 3
