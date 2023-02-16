import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int p = console.nextInt();

        int sum = 0;
        int temp = 0;
        if ((0 < n && n < 1000) && (0 < p && p < 1000)){
            for (int i = 1; i <= n; i++) {
                temp = console.nextInt();
                if (temp > p)
                    sum += temp;
            }
            System.out.println(sum);
        }
    }
}

