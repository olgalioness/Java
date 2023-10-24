package org.Basics_of_Java_Programming_1.Homework1part2;

import java.util.Scanner;
/*
3. Покупка телефона
Старый телефон Андрея сломался, поэтому он решил приобрести новый.
Продавец телефонов предлагает разные варианты, но Андрея интересуют только модели серии samsung или iphone.
Также Андрей решил рассматривать телефоны только от 50000 до 120000 рублей.
Чтобы не тратить время на разговоры, Андрей хочет написать программу, которая поможет ему сделать выбор.

На вход подается строка – модель телефона и число – стоимость телефона.
Нужно вывести "Можно купить", если модель содержит слово samsung или iphone и стоимость от 50000 до 120000 рублей включительно.
Иначе вывести "Не подходит".

Гарантируется, что в модели телефона не указано одновременно несколько серий.
 */
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


