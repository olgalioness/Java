package Course7_MultidimensionalArrays;

public class TempMultiArray {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1099, 100}, {1099, 0, 50}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);
                // Переставить matrix[i][j] и matrix[i1][j1]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
    }
}
