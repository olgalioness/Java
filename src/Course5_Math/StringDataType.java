package Course5_Math;

public class StringDataType {
    //Юникод ASCII  с \u0000 и заканчивая \u007F, что соответствует 128 символам ASCII
    // от '0' до '9'	от 48 до 57	от \u0030 до \u0039
    // от 'A' до 'Z'	от 65 до 90	от \u0041 до \u005A
    // от 'a' до 'z'	от 97 до 122	от \u0061 до \u007A
    // \b	Возврат (Backspace)	        \u0008	 8  десятичное значение
    // \t	Табуляция (Tab)            	\u0009	 9  десятичное значение
    // \n	Переход на новую строчку	\ u000A	 10 десятичное значение
    // \f	Переход на новую страницу	\u000C	 12 десятичное значение
    // \r	Возврат каретки	            \ u000D  13 десятичное значение
    // \\	Обратный слеш	            \u005C	 92 десятичное значение
    // \"	Двойные кавычки            	\u0022	 34 десятичное значение
    public static void main(String[] args) {
        char letter = 'A';              //char единичный символ
        letter = '\u0041';              // Уникод символа A равен 0041
        System.out.println(letter);     //A
        System.out.println(++letter);   //B ++ следующий или -- предшествующий символ

        System.out.println("\tОн сказал: \"Поехали!\"");

        // Обратите внимание, что шестнадцатеричное целое число записывается с помощью префикса 0X
        char ch = (char)0XAB0041;   // Последние 16 битов шестнадцатеричного
        // кода присваиваются переменной ch
        System.out.println(ch);     // ch равно символу A

        char ch1 = (char)65.25;     // значение с плавающей точкой сначала приводится к типу int, который затем приводится к типу char.
        System.out.println(ch1);    // ch равно символу A

        int i = (int)'B';           // Уникод символа B присваивается переменной i
        System.out.println(i);      // i равно 66

        byte b = 'a';               //неявное приведение типов  'a' равен значению 97, находится в диапазоне byte
        int c = 'a';

        //byte b1 = '\uFFF4';        //недопутимо уникод \uFFF4 не помещается в переменную типа byte
        byte b1 = (byte)'\uFFF4';    //используйте явное приведение типов
        System.out.println(b1);

        //Любое положительное число в 16-ричном формате от 0 до FFFF может быть неявно приведено к символу.
        //Любое число, не входящее в этот диапазон, должно быть приведено к символу явным образом
        //Операнд типа char автоматически приводится к числу, если другой операнд является числом или символом.
        //Если другой операнд является строкой, то символ конкатенируется со строкой.

        int y = '2' + '3';                                                  // (int)'2' равно 50 and (int)'3' равно 51
        System.out.println("y равно " + y);                                 // i равно 101
        int j = 2 + 'a';                                                    // (int)'a' равно 97
        System.out.println("j равно " + j);                                 // j равно 99
        System.out.println(j + " равно уникоду для символа " + (char)j);     // 99 равно уникоду для символа c
        System.out.println("Раздел " + '4');                                 //конкратенация строк

    }
}