package week2;


import java.util.Scanner;

/*
Напишите систему проверки цен на номер отеля по его типу.
Считать данные из консоли о типе номера отеля (Данные вводятся в виде значения int).
1 - VIP, 2 - Premium,  3 - Comfort,  4 - Economy.
Вывести цену номера:  VIP 12500 руб., Premium 9000 руб.,  Standard 6300 руб., Economy 3800 руб.
 */
public class Task4 {
    public static void main(String[] args) {
        final String rubleSignature = " руб.";

        Scanner console = new Scanner(System.in);
        System.out.println("Введите тип номера ");

        int roomType = console.nextInt();
        /*
        switch (roomType) {

            case 1://case- условие
                //case 1 - > //опускается break в jdk 19
                System.out.println("VIP " + 12500 + " руб.");
                break;
            case 2:         //ctrl+d продублировать
                System.out.println("Premium " + 9000 + " руб.");
                break;
            case 3:
                System.out.println("Standard " + 6300 + " руб.");
                break;
            case 4:
                System.out.println("Economy " + 3800 + " руб.");
                break;
            default:
                System.out.println("Неизвестный тип номера! Пожалйста введите допустимое значение");
               */
            switch (roomType) {
                case 1 -> System.out.println("VIP " + 12500 + rubleSignature);
                case 2 -> System.out.println("Premium " + 9000 + rubleSignature);
                case 3 -> System.out.println("Comfort " + 6300 + rubleSignature);
                case 4 -> System.out.println("Economy " + 3800 + rubleSignature);
                default -> System.out.println("Неизвестный тип номера! Пожалуйста введите допустимое значение: (1-4)");
        }

    }
}
