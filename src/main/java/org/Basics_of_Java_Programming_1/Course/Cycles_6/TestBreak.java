package org.Basics_of_Java_Programming_1.Course.Cycles_6;

public class TestBreak {
    public static void main(String[] args) {
        int sum, number;

        sum = 0;
        number = 0;
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100)
                break;
        }
        System.out.println("Число равно " + number);
        System.out.println("Сумма равна " + sum);
    }
}

