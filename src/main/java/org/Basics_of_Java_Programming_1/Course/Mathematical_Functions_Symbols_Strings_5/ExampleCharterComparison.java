package org.Basics_of_Java_Programming_1.Course.Mathematical_Functions_Symbols_Strings_5;

public class ExampleCharterComparison {
    public static void main(String[] args) {
        char x = 'a';
        char y = 'c';
        System.out.println(++x);            //b
        System.out.println(y++);            //c - выводится знаечение c, после чего к переменной ++
        System.out.println(x - y);          // b = 98 - d = 100 = -2

        char c = 'A';
        int i = (int)c;
        System.out.println(i);              //65

        float f = 1000.34f;
        i = (int)f;
        System.out.println(i);              //1000

        double d = 1000.34;
        i = (int)d;
        System.out.println(i);              //1000

        int v = 97;
        char z = (char)v;
        System.out.println(z);              //a

        System.out.println((int)(Math.random() * 26 + 'a'));            //10

        System.out.println('a' < 'b');          //true
        System.out.println('a' <= 'A');         //false
        System.out.println('a' > 'b');          //false
        System.out.println('a' >= 'A');         //true
        System.out.println('a' == 'a');         //true
        System.out.println('a' != 'b');         //true
    }
}


