package org.Basics_of_Java_Programming_1.Course.Data_Types_And_Arithmetic_Expressions_3.week4;

import java.util.Scanner;

/*
Дано целое число n.
Найти n число Фибоначчи с помощью цикла.
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946
F0 = 0
F1 = 1
Fn = Fn-1 + Fn-2
Фибоначчи - последовательность, в которой первые два числа равны 0 и 1,
а каждое последующее число равно сумме двух предыдущих чисел
Fn = Fn-1 + Fn-2, n>=2
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();

        int fib0 = 0;
        int fib1 = 1;

        if (n == 0) {
            System.out.println(fib0);
            System.exit(0);
        }

        if (n == 1) {
            System.out.println(fib1);
            return;                                     //выкидывает из метода main, по-этому программа завершается
        }

        int fibResult = 0;
        for (int i = 2; i <= n; i++) {
            fibResult = fib0 + fib1;
            fib0 = fib1;
            fib1 = fibResult;
        }
        System.out.println(fibResult);
    }
}
