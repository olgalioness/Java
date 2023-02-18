package week1;

import java.util.Scanner;

/*Даны числа a, b, c. Перенести значения из a в b, из b в c, из c в a.
входные данные 3 2 1
выходные данные: a = 1, b = 3, c = 2
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);               //тип переменной сканер(клас Scanner), создаем экземпляр класса и передаем system.in поток ввода
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        System.out.println("a = " + a + " b = " + b + " c = " + c);
        //int buffer = 0;
        int buffer = c;                                         //временная переменная temp, buffer для сдвига влево
        c = b;
        a = buffer;
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
}
        //src корневая дирректорий - mark directory - corse root
    // однострочный комментарий
    /* многострочный комментарий */
    /**
     * java doc
     */
    // new Scanner(System.in).var                   //объявляем перменную типа сканер скласс, сканеру создаем экземпляр класса и передаем поток ввода
    //считывание с консоли либо по разделителю либо по ентеру
    //no usages класс нигде не используется
    //ctrl + a, ctrl+a+L   выделить и отредактировать код

