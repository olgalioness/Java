package Course5_Math;

public class TypeOfString {
    //String - ссылочный тип данных
    //Любой Java-класс может использоваться переменной в качестве ссылочного типа.
    //length()	        Возвращает количество символов в строке. не имеет ни одного аргумента
    //не используйте индексы за пределами s.length() - 1. Например, s.charAt (s.length()) вызовет исключение StringIndexOutOfBoundsException.
    //charAt(index) 	Возвращает символ в указанном индексе (index) строки. имеет один аргумент. от 0 до s.length() - 1
    //concat(s1) 	    Возвращает новую строку, конкатенированную со строкой s1.
    //toUpperCase()	    Возвращает новую строку со всеми заглавными буквами.
    //toLowerCase()	    Возвращает новую строку со всеми строчными буквами.
    //trim()	        Возвращает новую строку с усеченными с обеих сторон пробелами.

    public static void main(String[] args) {
        String message = "Welcome to Java ";
        message += " and Java is fun ";                                                 //конкатенация message = message + " and Java is fun "
        System.out.println("Длина строки " + message + " равна " + message.length());
        System.out.println("Welcome to Java".length());                                 //15 допустимо обращение к строковому литералу
        System.out.println("".length());                                                //0
        System.out.println("Welcome to Java".charAt(0));                                //W
        String myString = message + " and " + "HTML";
        System.out.println(message.concat(myString));                                   //Welcome to Java Welcome to Java and HTML



        // Конкатенируются три строки
        String message1 = "Welcome " + "to " + "Java";
        System.out.println(message1);
        // Число 2021 конкатенируется со строкой " год"
        String s = 2021 + " год";                                   // s равно 2021 год число преобразуется в строку
        System.out.println(s);
        // Строка Приложение конкатенируется с символом B
        String s1 = "Приложение " + 'B';                            // s1 равно Приложение B
        System.out.println(s1);

        int i = 1;
        int j = 2;
        System.out.println("i + j равно " + i + j);                 //????????????
        System.out.println("i + j равно " + (i + j));

        System.out.println("Welcome".toLowerCase());
        System.out.println("Welcome".toUpperCase());
        System.out.println("\t Добрый день \n".trim());             // возвращает новую строку, усекая пробельные символы с обоих концов строки.

    }
}
