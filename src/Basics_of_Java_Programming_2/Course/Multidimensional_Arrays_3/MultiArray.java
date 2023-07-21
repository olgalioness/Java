package Course7_MultidimensionalArrays;

import com.sun.jdi.PathSearchingVirtualMachine;

public class MultiArray {
    public static void main(String[] args) {
        double[][] distances = {
                {0, 1099, 966, 3005, 1040, 496, 1645},
                {1099, 0, 799, 2838, 393, 1595, 1478},
                {966, 799, 0, 2039, 406, 1057, 679},
                {3005, 2838, 2039, 0, 2445, 3096, 1360},
                {1040, 393, 406, 2445, 0, 1463, 1085},
                {496, 1595, 257, 3096, 1463, 0, 1736},
                {1645, 1478, 679, 1360, 1085, 1736, 0},
        };
        int[][] matrix = new int[2][2];
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Введите " + matrix.length + " строчек и " +
                matrix[0].length + " столбцов: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random() * 100);
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
    }
}
