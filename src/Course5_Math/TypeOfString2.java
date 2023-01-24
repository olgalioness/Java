package Course5_Math;

public class TypeOfString2 {
    //equals(s1)	            Возвращает true, если строка равна строке s1.
    //equalsIgnoreCase(s1)	    Возвращает true, если строка равна строке s1; не учитывает регистр.
    //compareTo(s1)	            Возвращает целое число, большее 0, равное 0 или меньшее 0, для указания того, является ли строка больше, равной или меньше s1.
    //compareToIgnoreCase(s1)	Аналогичен методу compareTo(), за исключением того, что сравнение не учитывает регистр.
    //startsWith(prefix)	    Возвращает true, если строка начинается с указанного префикса (prefix).
    //endsWith(suffix)	        Возвращает true, если строка заканчивается с указанным суффиксом (suffix).
    //contains(s1)	            Возвращает true, если s1 является подстрокой.


    public static void main(String[] args) {
        String string1 = "объект";
        String string2 = "объект";

        if (string1 == string2)                                                 //== проверяет только, ссылаются ли string1 и string2 на один и тот же объект
            System.out.println("string1 и string2 - один и тот же объект");
        else
            System.out.println("string1 и string2 - разные объекты");

        if (string1.equals(string2))                                                    //equals() имеют ли они одинаковое содержимое
            System.out.println("string1 и string2 имеют " + "одинаковое содержимое");
        else
            System.out.println("string1 и string2 не равны");

        if (string1.equals(string2))                                                    //equals() имеют ли они одинаковое содержимое
            System.out.println("string1 и string2 имеют " + "одинаковое содержимое");
        else
            System.out.println("string1 и string2 не равны");

        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";
        System.out.println(s1.equals(s2));                  // true
        System.out.println(s1.compareTo(s3));               //0, если s1 равно s2, значение меньше 0, если s1 лексикографически (т. е. с учетом упорядочения в Уникоде) меньше s2, и значение больше 0, если s1 лексикографически больше s2.

        //При сравнении строк с помощью операторов отношений >, >=, < и <= происходят синтаксические ошибки. Вместо этого необходимо использовать s1.compareTo(s2).



    }

}
