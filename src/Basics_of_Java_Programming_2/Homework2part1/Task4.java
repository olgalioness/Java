package Homework2part1;
/*
4.	(1 балл) На вход подается число N — длина массива. Затем передается массив целых чисел (ai) из N элементов, отсортированный по возрастанию.

Необходимо вывести на экран построчно сколько встретилось различных элементов. Каждая строка должна содержать количество элементов и сам элемент через пробел.

Ограничения:
0 < N < 100
●-1000 < ai < 1000
 */
import java.util.Scanner;

public class Task4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = scanner.nextInt();
            int[] ai = new int[N];

            for (int i = 0; i < ai.length; i++) {
                ai[i] = scanner.nextInt();
            }
            int[] result = new int[N];
            int counter = 0;

            for (int i = 0; i < ai.length; i++) {
                boolean flag = false;
                for (int j = 0; j < i; j++) {
                    if (ai[i] == ai[j]) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    result[counter++] = ai[i];
                }
            }
            for (int i = 0; i < counter; i++) {
                int count = 0;
                for (int j = 0; j < ai.length; j++) {
                    if (result[i] == ai[j]) {
                        count++;
                    }
                }
                System.out.println(count + " " + result[i]);
            }
        }
    }

