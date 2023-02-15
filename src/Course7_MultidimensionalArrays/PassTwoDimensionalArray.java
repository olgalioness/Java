package Course7_MultidimensionalArrays;

import java.util.Scanner;

public class PassTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] m = getArray();

        System.out.println("\nСумма элементов равна " + sum(m));
    }

    /**
     * Получает значения элементов
     */
    public static int[][] getArray() {                                  //ввести пользователю значения массива
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.println("Введите " + m.length + " строчек и "
                + m[0].length + " столбцов через пробел: ");
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[i].length; j++)
                m[i][j] = input.nextInt();

        return m;
    }

    /**
     * Вычисляет сумму элементов
     */
    public static int sum(int[][] m) {                                  //иммет в качества аргумента двумсерный массив
        int total = 0;
        for (int row = 0; row < m.length; row++) {                      //получить количество строчек
            for (int column = 0; column < m[row].length; column++) {    //получить количество столбцов
                total += m[row][column];
            }
        }

        return total;
    }
}
