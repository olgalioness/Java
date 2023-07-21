package HomeworkOOP4;

import java.util.stream.IntStream;

/*
       Посчитать сумму четных чисел в промежутке от 1 до 100 включительно и вывести ее на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        // System.out.println(IntStream.rangeClosed(1, 100)
        //        .filter(i -> i % 2 == 0)                                    //отфильтровать значения на четность
        //        .reduce(0, Integer::sum));                                //integer класс обертка вызов суммы


        //System.out.println(IntStream.rangeClosed(1, 100)
        //        .filter(x -> x % 2 == 0)
        //        .sum());


        int a = 1;
        int b = 100;
        int s = IntStream.rangeClosed(a, b)                           //передача аргумента
                .filter(x -> x % 2 == 0)
                .sum();
        System.out.println(s);
    }
}


