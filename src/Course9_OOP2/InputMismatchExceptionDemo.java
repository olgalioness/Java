package Course9_OOP2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Введите целое число: ");
                int number = input.nextInt();

                // Отобразить результат
                System.out.println(  "Введенное число равно " + number);

                continueInput = false;
            }
            catch (InputMismatchException ex) {
                System.out.println("Попробуйте еще раз. (" +
                        "Некорректные входные данные: требуется целое число)");
                input.nextLine(); // входные данные игнорируются
            }
        } while (continueInput);            //Переменная continueInput управляет циклом. Ее начальное значение равно true  и оно изменяется на false
    }  
}
