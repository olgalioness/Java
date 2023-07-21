package Course7_Recursion;

public class FactorialTest1 {
    public static void main(String[] args) {
        System.out.println(
                "Сумма равна " + xMethod(5));
    }

    public static int xMethod(int n) {
        if (n == 1)
            return 1;
        else
            return n + xMethod(n - 1);              //сумма = 15
    }

        }


