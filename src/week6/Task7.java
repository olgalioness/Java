package week6;

import java.util.Scanner;

public class Task7 {
    public class Task6 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();

            int res = 1;
            for (int i = 1; i <= n; i++){
                res = res * i;

            }
            System.out.println("factorial (FOR LOOP): " + res);
            System.out.println("factorial (factorial): " + factorial(n));
        }
    }
    public static int factorial(int n) {
    if (n <= 1) {
        return 1;
    } return n * factorial(n-1);


    }
 /*   public static int factorialTail(int n, int result){
        if (n <= 1) {
            return result;

        }
        return n * factorialTail(int n-1, int result);
    }
    */
 //   public static void recursiveTest() {
  //      System.out.println("Hello World");
  //      recursiveTest();

    }

