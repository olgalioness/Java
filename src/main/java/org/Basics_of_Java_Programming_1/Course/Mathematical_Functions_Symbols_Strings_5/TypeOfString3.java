package org.Basics_of_Java_Programming_1.Course.Mathematical_Functions_Symbols_Strings_5;

public class TypeOfString3 {
    //indexOf(ch)	            Возвращает индекс первого вхождения символа ch в строке. Возвращает -1, если не входит.
    //indexOf(ch, fromIndex)	Возвращает индекс первого вхождения символа ch в строке после fromIndex. Возвращает -1, если не входит.
    //indexOf(s)	            Возвращает индекс первого вхождения заданной строки s в строке. Возвращает -1, если не входит.
    //indexOf(s, fromIndex)	    Возвращает индекс первого вхождения заданной строки s в строке после fromIndex. Возвращает -1, если не входит.
    //lastIndexOf(ch)	        Возвращает индекс последнего вхождения символа ch в строке. Возвращает -1, если не входит.
    //lastIndexOf(ch, fromIndex)Возвращает индекс последнего вхождения символа ch в строке перед fromIndex. Возвращает -1, если не входит.
    //lastIndexOf(s)	        Возвращает индекс последнего вхождения заданной строки s в строке. Возвращает -1, если не входит.
    //lastIndexOf(s, fromIndex)	Возвращает индекс первого вхождения заданной строки s в строке перед fromIndex. Возвращает -1, если не входит.
    public static void main(String[] args) {
        System.out.println("Welcome to Java".indexOf('W'));                          //0
        System.out.println("Welcome to Java".indexOf('o'));                          //4
        System.out.println("Welcome to Java".indexOf('o',5));           //9
        System.out.println("Welcome to Java".indexOf("come"));                       //3
        System.out.println("Welcome to Java".indexOf("Java", 5));       //11
        System.out.println("Welcome to Java".indexOf("java", 5));       //-1
        System.out.println("Welcome to Java".lastIndexOf('W'));                  //0
        System.out.println("Welcome to Java".lastIndexOf('o'));                  //9
        System.out.println("Welcome to Java".lastIndexOf('o', 5) );     //4
        System.out.println("Welcome to Java".lastIndexOf("come"));               //3
        System.out.println("Welcome to Java".lastIndexOf("Java", 5));   //-1
        System.out.println("Welcome to Java".lastIndexOf("Java"));               //11

        String s = "Имя Фамилия";
        int k = s.indexOf(' ');
        String firstName = s.substring(0, k);
        String lastName = s.substring(k + 1);
        System.out.println(firstName);
        System.out.println(lastName);

        String intString = "123";                               //числовая строка, если строка не число, произойдет ошибка выпоолнения
        int intValue = Integer.parseInt(intString);             //преобразовать строку в значение типа int
        System.out.println(intValue);

        String doubleString = "123.23";                         //если строка не число, произойдет ошибка выпоолнения
        double doubleValue = Double.parseDouble(doubleString);  //преобразовать строку в значение типа double
        System.out.println(doubleValue);

        System.out.println("1" + 1);                //11
        System.out.println('1' + 1);                //50
        System.out.println("1" + 1 + 1);            //111
        System.out.println("1" + (1 + 1));          //12
        System.out.println('1' + 1 + 1);            //51

        System.out.println(1 + "Welcome " + 1 + 1);             //1Welcome 11
        System.out.println(1 + "Welcome " + (1 + 1));           //1Welcome 2
        System.out.println(1 + "Welcome " + ('\u0001' + 1));    //1Welcome 2
        System.out.println(1 + "Welcome " + 'a' + 1);           //1Welcome a1


    }
}
