package Course7_MultidimensionalArrays;

public class MaxSummMultiarray {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1099, 100}, {1099, 0, 50}};
        int maxRow = 0;
        int indexOfMaxRow = 0;
// Вычислить сумму для первой строчки в maxRow
        for (int column = 0; column < matrix[0].length; column++) {
            maxRow += matrix[0][column];
        }
        for (int row = 1; row < matrix.length; row++) {
            int totalOfThisRow = 0;
            for (int column = 0; column < matrix[row].length; column++)
                totalOfThisRow += matrix[row][column];
            if (totalOfThisRow > maxRow) {
                maxRow = totalOfThisRow;
                indexOfMaxRow = row;
            }
        }
        System.out.println("Строчка " + indexOfMaxRow + " содержит наибольшую сумму, равную " + maxRow);
    }
}