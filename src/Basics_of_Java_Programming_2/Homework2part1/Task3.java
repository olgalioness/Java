import java.util.Scanner;
/*
3. Найти индекс
На вход подается число N — длина массива.
Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.
После этого вводится число X — элемент, который нужно добавить в массив, чтобы сортировка в массиве сохранилась.


Необходимо вывести на экран индекс элемента массива, куда нужно добавить X.
Если в массиве уже есть число равное X, то X нужно поставить после уже существующего.

Ограничение:
0 < N < 100
-1000 < ai < 1000
-1000 < X < 1000

Примечание:
Решение должно находиться в файле с названием Solution.java.
Публичный класс с решением должен называться Solution.
Использовать package нельзя.

Пример входных данных
6
10 20 30 40 45 60
12
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] arr1 = new int[N];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = console.nextInt();
        }
        int X = console.nextInt();
        indexSearch(arr1, X);
    }

    public static void indexSearch(int[] array, int search) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (search == array[i]) {
                index = i;
                i++;
            } else if (search < array[i]) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}