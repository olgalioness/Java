package Course6_Cycles;

import java.util.Scanner;
//вычисляет и отображает произведение введенных целых чисел до тех пор, пока их произведение меньше 10000

public class ComputeProduct {
    public static void main(String[] args) {
        int n, product;

        Scanner input = new Scanner(System.in);

        product = 1;
        while (product < 10000) {
            // Отобразить произведение
            System.out.println(product);
            // Получить целое число
            System.out.print("Введите целое число: ");
            n = input.nextInt();
            // Обновить произведение
            product *= n;
        }
    }
}
