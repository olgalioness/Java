package Course7_Methods;

public class Methods_example {
    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++)
            result += i;

        return result;
    }

    public static void main(String[] args) {
        System.out.println("Сумма от 1 до 10 равна " + sum(1, 10));
        System.out.println("Сумма от 20 до 37 равна " + sum(20, 37));
        System.out.println("Сумма от 35 до 49 равна " + sum(35, 49));
    }
}

/*
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("Сумма от 1 до 10 равна " + sum);
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println("Сумма от 20 до  37 равна " + sum);
        for (int i = 35; i <= 37; i++)
            sum += i;
        System.out.println("Сумма от 35 до 49 равна " + sum);
    }
}
*/

