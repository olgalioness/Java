package Homework2part1;
import java.util.Scanner;
/*На вход подается число N — длина массива.
Затем передается массив целых чисел (ai) из N элементов.
После этого передается число M — величина сдвига.

Необходимо циклически сдвинуть элементы массива на M элементов вправо.
 */
public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int M = scanner.nextInt();

        while (M > 0) {
            int lastTemp = arr[arr.length - 1];
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i];
                arr[i] = lastTemp;
                lastTemp = temp;
            }
            M--;
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}