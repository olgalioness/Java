package week2;
/*Даны два числа a и b. Проверить утверждение, что только одно из них нечетное.
        10 10 false
        11 10 true
        10 11 true
        11 11 false
    XOR - Исключающие ИЛИ
    A B RES
    0 0 0
    0 1 1
    1 0 1
    1 1 0

*/
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();

//        //Проверить утверждение, что хотя бы одно из них нечетное.
//        if (a % 2 != 0 || b % 2 != 0) {                               //утверждение может быть упрощено
//            System.out.println(true);                                 //при тернарном операторе проверяется первая часть и break
//        } else {
//            System.out.println(false);
//        }
        boolean aIsOdd = a % 2 != 0;
        boolean bIsOdd = b % 2 != 0;

        if ((aIsOdd && !bIsOdd) || (!aIsOdd && bIsOdd)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        if (aIsOdd ^ bIsOdd) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

