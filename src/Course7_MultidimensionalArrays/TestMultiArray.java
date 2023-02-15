package Course7_MultidimensionalArrays;

public class TestMultiArray {
    public static void main(String[] args) {

        int[][] array = {{1, 2}, {3, 4}, {5, 6}};
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = array[i].length - 1; j >= 0; j--)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        int[][] array2 = {{1, 2}, {3, 4}, {5, 6}};
        int sum = 0;
        for (int i = 0; i < array2.length; i++)
            sum += array2[i][0];
        System.out.println(sum);
    }
}
