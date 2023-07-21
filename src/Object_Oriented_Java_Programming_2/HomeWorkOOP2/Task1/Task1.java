package HomeWorkOOP2.Task1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*	Реализовать метод, который на вход принимает ArrayList<T>, а возвращает набор уникальных элементов этого массива. Решить используя коллекции.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0, 1, 1, 2, 3, 4, 4, 5);                 //лист определенного типа через array
        List<Integer> list2 = List.of(0, 1, 1, 2, 3, 4, 4, 5);                      //проистанцировать лист через list.of
        System.out.println(convert(list));                                          //выхов конвертирующего метода
    }

    public static <T> Set<T> convert(List<T> sourceList) {                          //отдавал на вход набор уникальных элементов (коллекция set)
        //HashSet<T> res = new HashSet<>();                                         //опеределить HastSet
        //return res.addAll(sourseList);
        return new HashSet<>(sourceList);                                           //у коллекции есть конструкторы которые принимают лист
        }                                                                           //конструктор HashSet принимает коллекцию (java.collection framework
}
