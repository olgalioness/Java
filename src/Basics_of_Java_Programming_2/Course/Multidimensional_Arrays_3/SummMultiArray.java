package Course7_MultidimensionalArrays;

public class SummMultiArray {
    public static void main(String[] args) {
        int[][] matrix = {{0, 1099}, {1099, 0}};

        //Сумирование всех элементов
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {

            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }
        System.out.println(total);
        //Cумированние по столбцам
        int total1 = 0;
        for (int column = 0; column < matrix[0].length; column++) {

            for (int row = 0; row < matrix.length; row++)
                total1 += matrix[row][column];
            System.out.println("Сумма для столбца " + column + " равна " + total1);
        }
        System.out.println(total1);
    }
}

