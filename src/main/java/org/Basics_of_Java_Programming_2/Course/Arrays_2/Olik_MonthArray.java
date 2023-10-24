package Course7_Arrays;

import java.util.Scanner;

public class Olik_MonthArray {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март"};
        Scanner input = new Scanner(System.in);
        System.out.print("Введите номер месяца (от 1 до 3): ");
        int monthNumber = input.nextInt();
        //System.out.println("Месяц - " + months[monthNumber - 1]);

        if (monthNumber == 1)
            System.out.println("Месяц - январь");
        else if (monthNumber == 2)
            System.out.println("Месяц - февраль");
        else
        System.out.println("Месяц - март");
    }
}
