package org.Basics_of_Java_Programming_1.tricksandfeatures;

//Дано:   x = 2, y = 4, z = 1. Какой результат будет у этого выражения: (++x - y++ + ++z) ? (Пожалуйста не пользуйтесь IDE)
public class PostfixAndPrefix {
    public static void main(String[] args) {
        int x =2, y =4, z = 1;

        System.out.println("Start");
        System.out.println(++x - y++ + ++z);                //y плюсует единицу но негде не используется
        System.out.println();

        int a = 5, b = 7;
        //трассировка
        System.out.println("a++ :" + a++);      //возвращает значение а
        System.out.println("a: " + a);          //а потом присваивает новое значение +1
        System.out.println();
        System.out.println("++b : " + ++b);     //вначале исходная переменная +1 и отдает результат 8
        System.out.println("b: " + b);
    }
}
