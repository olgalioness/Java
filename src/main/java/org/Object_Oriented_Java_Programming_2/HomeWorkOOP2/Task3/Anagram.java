package HomeWorkOOP2.Task3;

import java.util.Arrays;

/*2.	С консоли на вход подается две строки s и t. Необходимо вывести true, если одна строка является валидной анаграммой другой строки и false иначе.
Анаграмма — это слово или фраза, образованная путем перестановки букв другого слова или фразы, обычно с использованием всех исходных букв ровно один раз.

 */
public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("бейсбол", "бобслей"));                            //метод передающий две строки
        //System.out.println(isAnagram2("бейсбол", "бобслей"));
    }

    public static boolean isAnagram(String str1, String str2) {                         //возвращает try или false
        char[] charArr1 = str1.replace(" ", "").toCharArray();       //на вход принимает два слова string
        char[] charArr2 = str2.replace(" ", "").toCharArray();       //преобразуем стингу к чар аррай

        if (charArr1.length != charArr2.length) {                                        //сравнение массивов символов, каждый символ является ли уникальным.
            return false;                                                               //если длинна массивов не равна, то фолс,
        }

        Arrays.sort(charArr1);                                                          //если длинна равна, то сортируем и проверяем на совпадение
        Arrays.sort(charArr2);
        return Arrays.equals(charArr1, charArr2);
    }

    public static boolean isAnagram2(String str1, String str2) {                       //метод принимает две строки
        return Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());           //сравнение двух массивов и преобразование с помощью стримов и переводим в массив
    }
}
//убраи пробелы, перевели в массив символов, отсортировали и сравниди
//по производительности, первый вариант. Второй вариант - выстраивать другую архитектуру, цепочный вызов
