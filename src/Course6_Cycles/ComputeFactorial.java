package Course6_Cycles;

import java.util.Scanner;

//вычисляет и отображает факториал целого числа

public class ComputeFactorial {
    public static void main(String[] args) {
        int n, i, product;

        Scanner input = new Scanner(System.in);

        // Получить n
        System.out.print("Введите целое число: ");
        n = input.nextInt();

        // Вычислить n!
        product = 1;
        for (i = n; i > 1; --i)
            product *= i;

        // Отобразить n!
        System.out.println(n + "! равно " + product);

        //double item, sum;
        //sum = 0;
        //for (item = 1; item != 0; item -= 0.1)        // Нет гарантии, что item будет равен 0
        //    sum += item;                              //арифметические операции с числами с плавающей точкой выполняются с некоторым приближением
        //System.out.println(sum);

        int sum = 0;
        int b = 2;
        for (int odd = 1; odd < b; odd += 2) {             //odd  = 3
            sum += odd;                                    //sum = 1
        }
        System.out.println(sum);

        int j = 10;
        for (i = 1; i <= 5; ++i) {
            System.out.println(i + " " + j);
            j -= 2;
        }
        //отображение чисел кратных 4
        int mult4;
        for (mult4 = 0; mult4 < 100; mult4 += 4) {
            System.out.println(mult4);
        }
    }
}

