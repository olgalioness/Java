package org.Basics_of_Java_Programming_1.tricksandfeatures;

//Дано:   a = true, b = true, c = false. Какой результат будет у этого выражения: (a | b && c) ? (Пожалуйста не пользуйтесь IDE)
public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = true, c = false;
        System.out.println(a | b && c);     // битовое и, голическое и, false (b && c) | a порядок операторов
        System.out.println(a || b && c);     // логическое или, логическое и //если слева от оператора true, дальше не вычесляет

        //сокращенные операторы - если левый операнд равен true , оно не вычисляет правый операнд
        //используется скорости
        //а полный оператор вычисляет обе части и разный приоритет, у битовый приоритет выше, вычесляет слева и справа
    }
}



