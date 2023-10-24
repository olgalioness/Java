package HomeWorkOOP2.addTask;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Collections.reverseOrder;

/*
Реализовать метод, который принимает массив words и целое положительное число k. Необходимо вернуть k наиболее часто встречающихся слов..

Результирующий массив должен быть отсортирован по убыванию частоты встречаемого слова. В случае одинакового количества частоты для слов, то отсортировать и выводить их по убыванию в лексикографическом порядке.
words = ["the","day","is","sunny","the","the","the","sunny","is","is","day"]

k = 4	 ["the","is","sunny","day"]

 */
public class Main {
    public static void main(String[] args) {
        List<String> words = List.of("the","day","is","sunny","the","the","the","sunny","is","is","day");
        System.out.println(count(words, 4));
    }
    private static List<String> count(List<String> words, int k) {                                //передать в массив лист и количество символом которое нужно обрезать
        return words.stream()                                                                     //образуем стрим слов
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))     //группируем в коллекторский сет. the ключом.слово, 4 раз сколько.раз оно встречается и добавить мамы
                .entrySet()                                                                     //из мапы образуем entrySet
                .stream()
                .sorted(reverseOrder(Map.Entry.comparingByValue()))                             //пересортировка в обратном подарке по значению
                .limit(k)                                                                       //обежем
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());                                                  //упаковка в лист

    }
}
//обрезать массив и вывести наиболее чаще встречающие слова
//сделать из листа стрим. сколектить в мапу, посчитать по уникальным числам, пересортировать в обратном порядке, от самого большего к самому меньшему, отрезать количество слов сколько необходимо, сколектить и передать новый лист


//в случае совпадения частоты можно сверху наложить лексиграическом порядке преобразовать и хранитьь в сете или програть через корпоратор. или добавить сортировку по значению