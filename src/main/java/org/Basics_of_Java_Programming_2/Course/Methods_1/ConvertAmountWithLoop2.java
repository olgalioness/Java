package Course7_Methods;

import java.util.Scanner;

public class ConvertAmountWithLoop2 {
    static double ROUBLES_PER_DOLLAR = 72.12; // курс покупки           //константа доступна всем методам внутри класса

    public static void main(String[] args) {
        int dollars;
        double roubles;
        int digit;
        int n;
        int i;

        Scanner input = new Scanner(System.in);

        instruct();

        //Получать количество конвертаций до тех пор, пока не введено корректное значение
        do {
            System.out.println("Введите корректное количество конвертаций: ");
            n = input.nextInt();
        } while (n <= 0);

        //До тех пор, пока не конветипрваны все суммы, получать, отображать и конвертировать суммы денег в американских
        //долларах и отображать суммы денег в российских рублях
        for (i = 0; i < n; ++i) {

            System.out.println("Введите сумму денег в американских долларах: ");
            dollars = input.nextInt();

            System.out.print(dollars);      //отобразить сумму денег в долларах

            if (5 <= dollars && dollars <= 20)
                System.out.println(" американских долларов равны ");
            else {
                digit = dollars % 10;

                if (digit == 1)
                    System.out.println(" американский доллар равен ");
                else if (2 <= digit && digit <= 4)
                    System.out.println(" американских доллара равны ");
                else
                    System.out.println(" американских долларов равны");
            }
            //Конвертировать сумму денег в российские рубли
            roubles = ROUBLES_PER_DOLLAR * dollars;

            //Отобразить сумму денег в российских рублях в пользу покупателя
            System.out.println((int) (roubles * 100) / 100.0 + " российского рубля.");
        }
    }

    /**
     * Отображает инструкцию
     */
    public static void instruct() {
        System.out.println("Эта программа конвертирует сумму денег из американских долларов в российские рубли.");
        System.out.println("Курс покупки равен " + ROUBLES_PER_DOLLAR + " рубля.\n");
    }

    /**
     * Конвертирует сумму денег из американских долларов в российские рубли
     */
    public static double find_roubles(int dollars) {
        return ROUBLES_PER_DOLLAR * dollars;
    }
}

