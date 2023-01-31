package Homework1part3;

import java.util.Scanner;
/*3. Вычислить выражение
На вход подается два положительных числа m и n.
Необходимо вычислить m^1 + m^2 + ... + m^n

Ограничение:
0 < m, n < 10
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int m = console.nextInt();
        int n = console.nextInt();

        if ((0 < m && m < 10) && (0 < n && n < 10)) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += Math.pow(m, i);
            }
            System.out.println(sum);
        }
    }
}

