package org.Basics_of_Java_Programming_1.Course.Cycles_6;
//Написать таблицу умножения от 0 до 9

public class MultiplicationTable2 {
    public static void main(String[] args) {

        for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
            }
        }
    }
}


