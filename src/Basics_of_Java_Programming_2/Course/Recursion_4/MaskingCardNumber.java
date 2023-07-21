package Course7_Recursion;

import java.util.Scanner;

public class MaskingCardNumber {
    public static void main(String[] args) {
        String cardNumber; // номер карты
        Scanner input = new Scanner(System.in);

        // Получить номер карты
        System.out.print("Введите номер карты: ");
        cardNumber = input.next();

        // Получить маскированный номер карты с 4-мя последними элементами
        String updatedCardNumber = maskCharacters(cardNumber, 4);
        // Вывести маскированный номер карты
        System.out.println("Маскированный номер банковской карты:" + updatedCardNumber);
    }
        /**
         * Замена символов строки {@code input} символом '*'
         * с начала строки, не менять в конце {@code numberFromEnd} символа(ов)
         */
        static String maskCharacters (String input,int numberFromEnd){
        // Если количество отражаемых в конце символов меньше нуля
        // или больше или равно длине строки
        if (numberFromEnd < 0 || numberFromEnd >= input.length()) {
            // вернуть исходную строку
            return input;
        }
        // заменяем первый элемент строки
        // и делаем рекурсивный вызов для подстроки со 2-ого символа
        return "*" + maskCharacters(input.substring(1), numberFromEnd);
    }
}
