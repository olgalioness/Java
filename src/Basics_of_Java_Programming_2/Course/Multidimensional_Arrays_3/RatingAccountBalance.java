package Course7_MultidimensionalArrays;

import java.util.Scanner;

public class RatingAccountBalance {
    public static void main(String[] args) {
        int numberOfRecords; // количество клиентов
        Object[][] clients; // массив данных о клиентах

        Scanner input = new Scanner(System.in);

        // Получить количество клиентов
        System.out.print("Введите количество клиентов: ");
        numberOfRecords = input.nextInt();

        // инициализируем массив
        // 4 колонки: фамилия, имя, отчество, баланс счета
        clients = new Object[numberOfRecords][4];

        // Получить данные о клиентах
        for (int i = 0; i < numberOfRecords; i++) {
            System.out.print("Введите фамилию: ");
            // Записываем фамилию в колонку с индексом 0
            clients[i][0] = input.next();

            System.out.print("Введите имя: ");
            // Записываем имя в колонку с индексом 1
            clients[i][1] = input.next();

            System.out.print("Введите отчество: ");
            // Записываем отчество в колонку с индексом 2
            clients[i][2] = input.next();

            System.out.print("Введите сумму на счете: ");
            // Записываем баланс счета в колонку с индексом 3
            clients[i][3] = input.nextDouble();
        }
        // Отсортируем массив используя алгоритм сортировки пузырьком
        for (int i = 0; i < clients.length; i++) { // Внешний цикл
            for (int j = 0; j < clients.length - 1; j++) { // Внутренний цикл
                // первый элемент в паре
                // преобразуем объект типа Object к типу Double
                // и преобразуем к соответствующему примитиву double
                double firstInPair = (Double) clients[j][3];
                // второй элемент в паре
                double secondInPair = (Double) clients[j + 1][3];

                // Сравниваем элементы в паре, второй элемент должен быть больше
                if (firstInPair > secondInPair) {
                    // Если порядок элементов нарушен
                    // меняем строки местами
                    swap(clients, j, j + 1);
                }
            }
        }
        // Вывести отсортированные данные пользователей
        System.out.println("Данные клиентов в порядке увеличения баланса счета:");
        for (int i = 0; i < clients.length; i++) {

            // Формируем строку по каждому клиенту
            // Фамилия
            String surnameWithInitials = clients[i][0] + " ";
            // Инициал имени

            surnameWithInitials += clients[i][1].toString().substring(0, 1) + ".";
            // инициал отчества
            surnameWithInitials += clients[i][2].toString().substring(0, 1) + ".";
            // Баланс счета
            surnameWithInitials += " " + clients[i][3];
            System.out.println(surnameWithInitials);
        }
    }
    /**
     * Обмен строк с индексами i и j местами в двумерном массиве array
     */
    static void swap(Object[][] array, int i, int j) {
        // Обмениваем строки местами
        for (int k = 0; k < array[i].length; k++) { // Итерируемся по элементам двух строк
            // буферный элемент в котором хранится значение элемента массива строки с индексом i
            Object buff = array[i][k];
            // в ячейку строки с индексом i записываем значение из ячейки строки с индексом j той же колонки
            array[i][k] = array[j][k];
            // в ячейку строки с индексом j записываем значение из буфера
            array[j][k] = buff;
        }
    }
}