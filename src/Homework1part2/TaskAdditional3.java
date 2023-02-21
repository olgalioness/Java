package Homework1part2;

import java.util.Scanner;

public class TaskAdditional3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String model = input.nextLine();
        int price = input.nextInt();
        String iphone = "iphone";
        String samsung = "samsung";

        String conculison = model.contains(iphone) || model.contains(samsung) ? ((price >= 50000 && price <= 120000) ? "Можно купить" : "Не подходит") : "Не подходит";
        System.out.println(conculison);


        /*if ((model.contains(iphone) || model.contains(samsung)) && (price >= 50000 && price <= 120000)) {
                System.out.println("Можно купить");
            } else {
                System.out.println("Не подходит");
            }*/
        //String conculison = ((model.contains(iphone) || model.contains(samsung)) && (price >= 50000 && price <= 120000)) ? "Можно купить" : "Не подходит";

    }
}


