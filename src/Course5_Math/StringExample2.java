package Course5_Math;

import java.util.Scanner;

public class StringExample2 {
    public static void main(String[] args) {
        String s;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите целую строчку: ");
        s = input.nextLine();                               //nextLine считывания целой строчки текста можно использовать метод

        System.out.println("Введенная строчка равна " + s);
    }
}

