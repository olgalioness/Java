package week2;

import java.util.Scanner;

/*
        Реализовать System.out.println(), используя System.out.print() и табуляцию \n
        Входные данные: два слова, считываемые из консоли

        Входные данные
        Hello World
        Выходные данные
        Hello
        World
 */
public class Task8 {
    //          public static final String FIND_LOCATION_BY_NAME =
    //        "select o.object_id from db_objects o, db_object_type_parents notp\n" +
    //               "where notp.parent_id = 8500556741166916601650 /* Location */\n" +
    //                "and o.object_type_id = notp.object_type_id\n" +
    //                "and name = ?";
    //
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String first = console.next();
        String second = console.next();

        System.out.println(first + "\n" + second);
    }
}
