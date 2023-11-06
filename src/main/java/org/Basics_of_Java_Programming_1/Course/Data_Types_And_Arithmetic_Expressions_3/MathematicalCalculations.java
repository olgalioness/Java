package org.Basics_of_Java_Programming_1.Course.Data_Types_And_Arithmetic_Expressions_3;

public class MathematicalCalculations {
    public static void main(String[] args) {
        //возведение в степень
        System.out.println(Math.pow(2, 3)); //возведение в степень
        System.out.println(Math.pow(4, 0.5));
        System.out.println(Math.pow(2.5, 2));
        System.out.println(Math.pow(2.5, -2));

        System.out.println(56 % 6);     //остаток от деления
        System.out.println(78 % -4);
        System.out.println(-34 % 5);
        System.out.println(-34 % -5);
        System.out.println(5 % 1);      //can be replaced with 0
        System.out.println(1 % 5);

        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);

        System.out.println("25 / 4 равно " + 25 / 4);
        System.out.println("25 / 4.0 равно " + 25 / 4.0);
        System.out.println("3 * 2 / 4 равно " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 равно " + 3.0 * 2 / 4);

    }

}
