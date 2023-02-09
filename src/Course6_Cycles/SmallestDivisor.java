package Course6_Cycles;

import java.util.Scanner;

public class SmallestDivisor {
    public static void main(String[] args) {
        int factor = 2;
        Scanner console = new Scanner (System.in);
        int n = console.nextInt();
        while (factor <= n) {
            if (n % factor == 0)
                break;
            factor++;
        }
        System.out.println("Наименьший делитель, отличный от 1, для "
                + n + " равен " + factor);
        //аналог
        //for (int factor = 2; n % factor != 0; factor++);
        /*
        boolean found = false;
        int factor = 2;
        while (factor <= n && !found) {
        if (n % factor == 0)
        found = true;
        else
        factor++;
        }
        System.out.println("Наименьший делитель, отличный от 1, для " + n + " равен " + factor);
         */
    }
}
