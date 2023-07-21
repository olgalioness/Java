package Course7_Recursion;

public class FactorilaTest2 {
    public static void main(String[] args) {
        xMethod(1234567);
    }
    public static void xMethod(int n) {
        if (n > 0) {
            System.out.print(n % 10);
            xMethod(n / 10);                //7654321
        }
    }
}

