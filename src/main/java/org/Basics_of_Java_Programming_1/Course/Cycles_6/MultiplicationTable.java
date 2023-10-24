package org.Basics_of_Java_Programming_1.Course.Cycles_6;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Отобразить название таблицы
        System.out.println("\t\t\t\tТАБЛИЦА УМНОЖЕНИЯ\n");

        // Отобразить имена столбцов
        for (int j = 1; j <= 9; j++)
            System.out.print("\t" + j);

        System.out.println("\n\t_\t_\t_\t_\t_\t_\t_\t_\t_");

        // Отобразить имена строк и произведение
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + "   |");
            for (int j = 1; j <= 9; j++) {
                System.out.println("\t" + i * j);
            }
            System.out.println();
        }
    }
}
