package Week6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int res = 1;
        for (int i = 1; i <= n; i++){
            res = res * i;

        }
        System.out.println("factorial (FOR LOOP): " + res);
    }
}
