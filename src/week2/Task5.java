package week2;
/*Даны два числа a и b. Проверить утверждение, что только одно из них нечетное.
        10 10 false
        11 10 true
        10 11 true
        11 11 false
*/
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        double b = console.nextDouble();

        if (a % 2 != 0 || b % 2 != 8) {      //утверждение может быть упрощено
            System.out.println(true);       //при тернарном операторе проверяется первая часть и break
        } else {
            System.out.println(false);
        }
    }
}
