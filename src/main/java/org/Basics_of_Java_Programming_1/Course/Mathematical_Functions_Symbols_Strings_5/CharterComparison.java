package org.Basics_of_Java_Programming_1.Course.Mathematical_Functions_Symbols_Strings_5;

public class CharterComparison {
    //Сравнение и проверка символов
    public static void main(String[] args) {
        //является ли символ цифрой, буквой, заглавной или строчной буквой
        byte ch = 'b';
        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch + " является заглавной буквой");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch + " является строчной буквой");
        else if (ch >= '0' && ch <= '9')
            System.out.println(ch + " является символом цифры");
        //isDigit(ch)	        Возвращает true, если указанный символ является цифрой.
        //isLetter(ch)	        Возвращает true, если указанный символ является буквой.
        //isLetterOrDigit(ch)	Возвращает true, если указанный символ является буквой или цифрой.
        //isLowerCase(ch)	    Возвращает true, если указанный символ является строчной буквой.
        //isUpperCase(ch)	    Возвращает true, если указанный символ является заглавной буквой.
        //toLowerCase(ch)	    Возвращает строчное написание указанного символа.
        //toUpperCase(ch)	    Возвращает заглавное написание указанного символа.

        System.out.println("isDigit('a') равно " + Character.isDigit('a'));                     //false
        System.out.println("isLetter('a') равно " + Character.isLetter('a'));                   //true
        System.out.println("isLowerCase('a') равно " + Character.isLowerCase('a'));             //true
        System.out.println("isUpperCase('a') равно " + Character.isUpperCase('a'));             //false
        System.out.println("toLowerCase('T') равно " + Character.toLowerCase('T'));             //t
        System.out.println("toUpperCase('q') равно " + Character.toUpperCase('q'));             //Q

        System.out.println((int)'1');
        System.out.println((int)'A');
        System.out.println((int)'B');
        System.out.println((int)'a');
        System.out.println((int)'b');

        System.out.println((char)40);
        System.out.println((char)59);
        System.out.println((char)79);
        System.out.println((char)85);
        System.out.println((char)90);

        System.out.println((char)0X40);
        System.out.println((char)0X5A);
        System.out.println((char)0X71);
        System.out.println((char)0X72);
        System.out.println((char)0X7A);

        int i = '1';                                        //i равно 49, т.к. ASCII-код '1' равен 49.
        int j = '1' + '2' * ('4' - '3') + 'b' / 'a';        //j равно 100.
        int k = 'a';                                        //k равно 97, т.к. ASCII-код 'a' равен 97.
        char c = 90;                                        //c равно символу 'Z', т.к. (int)'Z' равно 90.
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(c);
    }
}
