package Homework1part1;
import java.util.Scanner;
/*
На вход подается количество секунд, прошедших с начала текущего дня – count.
Выведите в консоль текущее время в формате: часы и минуты.

Ограничения:
0 < count < 86400
 */
public class Task4 {
    public static void main(String[] args) {
        int minutes, hours, remainingMinutes;

        Scanner console = new Scanner(System.in);

        // Получить общее время в секундах
        System.out.print("Введите общее время в секундах: ");
        int count = console.nextInt();

        if (count > 0) {
            if (count < 86400) {
                // Вычислить время в минутах
                minutes = count / 60;
                // Вычислить время в часах
                hours = minutes / 60;

                //вычислить оставшиеся минуты
                remainingMinutes = minutes % 60;
                //remainingSeconds = minutes % 60;
                System.out.println(hours + " " + remainingMinutes);
            }
        }
    }
}
//chas = (int) (count / 3600);
//minute = (int) ((count % 3600) / 60);
