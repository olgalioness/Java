package Course6_Cycles;

import java.util.Scanner;

public class WhileN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Введите значение n для суммирования чисел: ");
        int n = console.nextInt();

        int sum = 0;
        int i = 0;
        while (i < n){
            i = i + 1;
            sum = sum + i;

        }
        System.out.print("Сумма введеных значения = " + sum);

        if (sum == (n * (n + 1)) / 2) {
            System.out.println(" Эквивалетно (n * (n + 1)) / 2 для n, равного " + n);
        }else{
            System.out.println(" Не эквивалетно (n * (n + 1)) / 2 для n, равного" + n);
        }
    }
}
