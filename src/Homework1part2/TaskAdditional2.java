package Homework1part2;

import java.util.Scanner;

public class TaskAdditional2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mailPackage = input.nextLine();

        String stones = "камни";
        String products = "запрещенная продукция";

        if (mailPackage.contains(stones) && mailPackage.contains(products)){
            System.out.println("в посылке камни и запрещенная продукция");
        } else if (mailPackage.contains(stones)){
            System.out.println("камни в посылке");
        } else if (mailPackage.contains(products)) {
            System.out.println("в посылке запрещенная продукция");
        } else {
            System.out.println("все ок");
        }
    }
}
