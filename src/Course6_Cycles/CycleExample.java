package Course6_Cycles;

public class CycleExample {
    public static void main(String[] args) {
        /*for (int n = 1; n < 5; n++) {
            int j = 0;
            while (j < n) {
                System.out.print(j + " ");
                j++;
            }
        }
        int k = 0;
        while (k < 5) {
            for (int j = k; j > 1; j--)
                System.out.print(j + " ");
            System.out.println("****");
            k++;
        }
    }*/

        int i = 5;
        while (i >= 1) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + "xxx");
                num *= 2;
            }
            System.out.println();
            i--;
        }
        /*
        int m = 1;
        do {
            int num = 1;
            for (int j = 1; j <= m; j++) {
                System.out.print(num + "G");
                num += 2;
            }
            System.out.println();
            m++;
        } while (m <= 5);
    }

        /*
        // отобразить верхнюю половину и центральный ряд
        for (int y = 1; y <= 6; ++y) {
            for (int x = 0; x < y; ++x)
                System.out.print("  " + x);
            System.out.println();
        }

        // отобразить нижнюю половину
        for (int y = 5; y > 0; --y) {
            for (int x = 0; x < y; ++x)
                System.out.print("  " + x);
            System.out.println();
        }
    */
    }
}


