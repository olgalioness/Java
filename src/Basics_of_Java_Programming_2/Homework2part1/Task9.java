package Homework2part1;
/*
9. Найти дубликат
На вход подается число N — длина массива.
Затем передается массив строк из N элементов (разделение через перевод строки).
Каждая строка содержит только строчные символы латинского алфавита.

Необходимо найти и вывести дубликат на экран.
Гарантируется что он есть и только один.

Ограничение:
0 < N < 100
0 < ai.length() < 1000
 */
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        String[] ai = new String[N];

        if (0 < N && N < 100) {
            for (int i = 0; i < N; i++) {
                ai[i] = scanner.next();
            }
            int count = 0;
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (ai[i].equals(ai[j])) {
                        count++;
                        if (count != 1) {
                            return;
                        } else {
                            System.out.println(ai[i]);
                        }
                    }
                }
            }
        }
    }
}