package org.Basics_of_Java_Programming_1.Homework1part2;

import java.util.Scanner;

/*
На следующий день на работе Петю и его коллег попросили заполнить анкету.
Один из вопросов был про уровень владения английского.
Петя и его коллеги примерно представляют, сколько они знают иностранных слов.
Также у них есть табличка перевода количества слов в уровень владения английском языком.
Было бы здорово автоматизировать этот перевод!

На вход подается положительное целое число count - количество выученных иностранных слов.
Нужно вывести какому уровню соответствует это количество.

| Количество слов    | Уровень английского |
|----------------------|-----------------------|
| count < 500          | beginner              |
| 500 <= count < 1500  | pre-intermediate      |
| 1500 <= count < 2500 | intermediate          |
| 2500 <= count < 3500 | upper-intermediate    |
| 3500 <= count        | fluent                |

Ограничение:
0 <= count < 10000
 */
public class Task6 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.print("Введите количество выученных слов: ");
        int count = console.nextInt();

        if (count > 0 && count < 500) {
            System.out.print("beginner");
        } else if (count >= 500 && count < 1500) {
            System.out.print("pre-intermediate");
        } else if (count >= 1500 && count < 2500) {
            System.out.print("intermediate");
        } else if (count >= 2500 && count < 3500) {
            System.out.print("upper-intermediate");
        } else if (count >= 3500 && count < 10000) {
            System.out.print("fluent");
        }
    }
}


